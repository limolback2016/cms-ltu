package cms;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


public class Cms {
	
	public static void main(String[] args) {
		Cms cs = new Cms();
		cs.createNewUser();

	}
	
	public int createNewCase(){
		Task task = new Task();
		Type type = null;
		Priority priority = null;
		task.addTask(type.ACTIVE_DIRECTORY, priority.A);
		//task.info();
		return 0;
	}
	
	public void updateCase(){
		Task task = new Task();
		task.getTaskId();
	}
	
	public void removeCase(){
		
	}
	
	public int createNewUser(){
		AtomicInteger count = new AtomicInteger(0); 
		int userId = count.getAndIncrement();
		System.out.println("Users id is: " + userId);
		
		System.out.println("Add new user's name: ");
		Scanner input = new Scanner(System.in);
		String info = input.nextLine();
		int phoneNr = input.nextInt();
		User user = new User();
		
		user.setName(info);
		
		System.out.println("Add new user's surname: ");
		user.setSurname(info);
		System.out.println("Add new user's surname: ");
		user.setEmail(info);
		user.setMobilePhone(phoneNr);
		user.setPosition(info);
		return userId; //return user_id 
	}
	
	public void updateUser(){
		
	}
	
	public void showAllCases(Priority p, Status s){
		
	}
	

}
