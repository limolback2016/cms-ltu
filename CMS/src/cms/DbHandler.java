package cms;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class DbHandler {
	private Logger logger = null;
	private boolean debug = false;

	Connection connection;
	DbConnection dbConnection;

	// for live code
	public DbHandler() throws Exception {
		init();
	}

	// for test
	public DbHandler(boolean activateDebug, Logger log) throws Exception {
		this.debug = activateDebug;
		this.logger = log;
		init();
	}

	public void init() throws Exception {
		dbConnection = new DbConnection();
		// database is connected by connection variable
		connection = dbConnection.connect(); 
	}
	
	// database accept null field, therefore we just insert enum-variable here
	public int createTask(Task task) throws Exception {
		// insert a new task
		String queryInsert = "INSERT INTO Task (type, priority, status) VALUES ( "
				+ task.getType()
				+ ","
				+ task.getPriority()
				+ ","
				+ task.getStatus() + " ); ";
		// run SQL
		runQuery(queryInsert);

		// select latest row: SELECT * FROM Table ORDER BY ID DESC LIMIT 1
		String querySelect = "SELECT taskId FROM Task ORDER BY taskId DESC LIMIT 1;";

		// return task_id
		ResultSet rs = runQuery(querySelect);
		while (rs.next()) {
			return Integer.valueOf(rs.getString("taskId"));
		}
		return -1;
	}
	
	public ResultSet getTask(int taskId) throws Exception{
		ResultSet rs = runQuery("SELECT *FROM Task WHERE taskId = " + taskId);
		return rs; 
	}

	public void updateTask(Task task) throws Exception {
		// UPDATE exited tasks
		String queryUpdate = "UPDATE Task SET type " 
				+ task.getType() + ", priority " 
				+ task.getPriority() + ", status "
				+ task.getStatus() + ", department "
				+ task.getDepartment() + ", startDate "
				+ task.getStartDate() + ", endDate "
				+ task.getEndDate() + ", estimatedTime "
				+ task.getEstimatedTime() + ", actualTime "
				+ task.getActualTime() + ", comment "
				+ task.getComment() + ", userId "
				+ task.getUserId() + ", WHERE "
				+ task.getTaskId().equals(task.getTaskId()) + ";";
		runQuery(queryUpdate);
	}

	public void deleteTask(Task task) throws Exception {
		// delete a task from the table
		String queryDelete = "DELETE FROM Task WHERE " + task.getTaskId()
				+ ";";
		runQuery(queryDelete);
	}

	public int createUser(User user) throws Exception {
		String queryInsert = "INSERT INTO User (competenc) VALUES ( "
				+ user.getCompetence() + " );";
		runQuery(queryInsert);

		String querySelect = "SELECT userId FROM Task ORDER BY userId DESC LIMIT 1;";

		ResultSet rs = runQuery(querySelect);
		while (rs.next()) {
			return Integer.valueOf(rs.getString("userId"));
		}
		return -1;
	}
	
	public ResultSet getUser(int userId) throws Exception{
		ResultSet rs = runQuery("SELECT *FROM Task WHERE userId = " + userId);
		return rs; 
	}

	public void updateUser(User user) throws Exception {
		//UPDATE table_name
		//SET column1 = value1, column2 = value2, ...
		// WHERE condition;
		String queryUpdate = "UPDATE User SET competence = " + user.getCompetence()
				+ ", name = " + user.getName()
				+ ", surname = " + user.getSurname()
				+ ", email = " + user.getEmail()
				+ ", mobilePhone = " + user.getMobilePhone()
				+ ", position = " + user.getPosition()
				+ ", personalNo = " + user.getPersonalNo()
				+ " WHERE " + user.getUserId().equals(user.getUserId()) + " ;";
		runQuery(queryUpdate);
	}

	public void deleteUser(User user) throws Exception {
		String queryUserDelete = "DELETE FROM User WHERE " + user.getUserId()
				+ ";";
		runQuery(queryUserDelete);
	}

	public ResultSet runQuery(String query) throws Exception {
		// for debug need
		if (debug) {
			logger.info(query);
		}
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = connection.createStatement();
			rs = stmt.executeQuery(query);
		} catch (Exception e) {
			if (debug) {
				logger.info(e.getMessage());
			}
		} finally {
			if (stmt != null) {
				stmt.close();
			}
		}
		return rs;
	}

}
