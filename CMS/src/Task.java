
// test my repo
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
	
	public enum Type {
		INSTALLATION_SOFTWARE("installation of software"),
		INSTALLATION_KILENT_OS("installation of Operativ system for klient"),
		SYSTEMTEST("system test"),
		SUPPORT_SOFTWARE("software support"),
		SUPPORT_NETWORK("network support"),
		TROUBLESHOOTING("troubleshooting"),
		ACTIVE_DIRECTORY("active directory");
		
		final String s;
		
		Type(String str) {
			this.s = str;
		}
		
		public String getString() {
			return this.s;
		}
	}
	
	public enum Priority {
		A("a"),
		B("b"),
		C("c"),
		D("d");
		
		final String s;
		
		Priority(String str){
			this.s = str;
		}
		
		public String getString(){
			return this.s;
		}
	}

	public enum Status {
		NEW("new"),
		ASSIGNED("assigned"),
		ONGOING("ongoing"),
		BLOCKED("blocked"),
		CLOSED("closed");
		
		final String s;
		
		Status(String str){
			this.s = str;
		}
		
		public String getString(){
			return this.s;
		}
	}
}

