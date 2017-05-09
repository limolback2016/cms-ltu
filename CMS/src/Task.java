// test your case this is my case "hello world"
public enum Type {
	INSTALLATION_SOFTWARE,
	INSTALLATION_KILENT_OS,
	SYSTEMTEST,
	SUPPORT_SOFTWARE,
	SUPPORT_NETWORK,
	TROUBLESHOOTING,
	ACTIVE_DIRECTORY;
}

public enum Priority {
	A,
	B,
	C,
	D;
}

public enum Status {
	NEW,
	ASSIGNED,
	ONGOING,
	BLOCKED,
	CLOSED;
}

public class Task {
	private String department;
	private String startDate;
	private String endDate;
	private int estimatedTime;
	private int actualTime;
	private String comment;
	private Task taskId;
	private User userId;
	private Type type;
	private Priority priority;
	private Status status;
	
	public void setPriority(Priority priority){
		this.priority = priority;
	}
	
	public Priority getPriority(){
		return this.priority;
	}
	
	public void setStatus(Status status){
		this.status = status;
	}
	
	public Status getStatus(){
		return this.status;
	}
	
	public void setDepartment(String department){
		this.department = department;
	}
	
	public String getDepartment(){
		return this.department;
	}
	
	public void setStartDate(String startDate){
		this.startDate = startDate;
	}
	
	public String getStartDate(){
		return this.startDate;
	}
	
	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public String getEndDate(){
		return this.endDate;
	}
	
	public void setEstimatedTime(int estimatedTime){
		this.estimatedTime = estimatedTime;
	}
	
	public int getEstimatedTime(){
		return this.estimatedTime;
	}
	
	public void setActualTime(int actualTime){
		this.actualTime = actualTime;
	}
	
	public int getActualTime(){
		return this.actualTime;
	}
	
	public void setComment(String comment){
		this.comment = comment;
	}
	
	public String getComment(){
		return this.comment;
	}
	
	public Task getTaskId(){
		return this.taskId;
	}
	
	public User getUserId(){
		return this.userId;
	}
	
	public void addTask(Type type, Priority priority){
		this.type = type;
		this.priority = priority;
	}
}

