
import java.util.ArrayList;

public class TaskHandler {
	/*private Status status;
	private Priority priority;
	private Type type;
	private Competence competence;*/
	private ArrayList<Task> tasks = new ArrayList<>();
	private ArrayList<User> users = new ArrayList<>();
	private Task task;
	
	public ArrayList<Task> listOpenTask(){
		return tasks;
	}
	
	/*public ArrayList<Task> listTask(Status status){
		return tasks;
	}*/
	
	/*public ArrayList<Task> listOpenTasks(Priority priority){
		return tasks;
	}*/
	
	/*public ArrayList<Task> listOpenTasks(Type type){
		return tasks;
	}*/
	
	public ArrayList<Task> listClosedTasks(){
		return tasks;
	}
	
	/*public ArrayList<User> listUsersBasedOnCompetence(Competence competence){
		return users;
	}*/
	
	public Task createTask(){
		return task;
	}
	
	public Task updateTask(int taskId){
		return task;
	}
	
	public Task deleteTask(int taskId){
		return task;
	}
}

