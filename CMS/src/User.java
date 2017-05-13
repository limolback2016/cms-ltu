
enum Competence {
	NETWORK("Nätverk"),
	STORAGE("Lagring"),
	DATABASE,
	INCIDENT_HANDLER,
	USER,
	INSTALLATION;
}

public class User {
	private String name;
	private String surname;
	private String email;
	private int mobilePhone;
	private String position;
	private User userId;
	private User personalNo;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	public User getUserId(){
		return userId;
	}

	public User getPersonalNo() {
		return personalNo;
	}
	

}

