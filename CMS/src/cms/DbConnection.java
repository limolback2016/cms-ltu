package cms;
/*
 * This class will handler connection 
 * between database and application
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.logging.Logger;

public class DbConnection {
	private String serverAddress;
	private String port;
	private String user;
	private String password;
	private String db;
	private Connection conn = null;
	private boolean debug = false;
	private Logger logger = null;
	
	Properties prop = new Properties();
	InputStream file = null;
	
	public DbConnection(boolean activateDebug, Logger log) throws Exception {
		this.debug = activateDebug;
		this.logger = log;
		init();
	}
	
	private void init() throws Exception {
		try {
			this.file = new FileInputStream(DbConnection.class.getResource("/Files/db.properties").getPath());
			prop.load(this.file);
			
			serverAddress = prop.getProperty("server");
			port = prop.getProperty("port");
			user = prop.getProperty("user");
			password = prop.getProperty("password");
			db = prop.getProperty("database");
			
			if(debug) {
				logger.info("Server address: " + serverAddress);
				logger.info("Username: " + user);
				logger.info("Password: " + password);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection connect(){
		try { 
			String DB_URL = "jdbc:mysql://" + serverAddress + ":" + port + "/" + db;
			String connectionString = DB_URL + ", " + user + ", " + password;
			if(debug) {
				logger.info("Connection string: " + connectionString);
			}
			conn = DriverManager.getConnection(DB_URL, user, password);
			if(debug) {
				logger.info(conn.toString());
			}
		}
			
		catch (Exception ex){
			ex.printStackTrace();
		}
		return conn;
	}
	
	public void disconnect() throws Exception{
		conn.close();
	}
}



