/*
 * This class will handler connection 
 * between database and application
 */
import java.awt.Transparency;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class DbConnection {
	private String serverAddress;
	private String port;
	private String user;
	private String password;
	
	Properties prop = new Properties();
	InputStream file = null;
	
	/*public DbConnection() {
		this.file = new FileInputStream("db.properties");
	}*/
	
	
	public void connect(){
		
		try { 
			// 1. get connection to databas
			Connection conn = DriverManager.getConnection("jdbc:mysql://cirkusen.mynetgear.com/", "li", "Kilian2016");
			
			// 2. Create a statement
			Statement stmt = conn.createStatement();
			
			// 3. Execute SQL quary
			ResultSet rs = stmt.executeQuery("SELECT * FROM anmarkning");
			
			// 4. Process the result set 
			while (rs.next()) {
				System.out.println(rs.getString("anmakrningsId") + ", " + rs.getString("inspektionsId") + ", " + rs.getString("beskrivning"));
			}
		}
		catch (Exception ex){
			ex.printStackTrace();
		}
		
		init();
	}
	
	public void disconnect(){
		
	}
	
	public void init(){
		try {
			String filename = "db.properties";
			file = DbConnection.class.getClassLoader().getResourceAsStream(filename);
			if(file==null){
				System.out.println("Sorry, unable to find " +  filename);
				return;
			}
		} catch (Exception exception) {
			exception.printStackTrace();
		} finally {
			if(file != null){
				try {
					file.close();
				} catch (IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	
}



