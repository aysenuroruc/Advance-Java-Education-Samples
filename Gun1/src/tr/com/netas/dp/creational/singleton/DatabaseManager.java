package tr.com.netas.dp.creational.singleton;

public class DatabaseManager {
	
	private String username;
	private String password;
	
	private static DatabaseManager databaseManager;
	
	
	public static DatabaseManager newInstance()
	{
		if(databaseManager==null)
		{
			databaseManager = new DatabaseManager();
		}
		
		return databaseManager;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	private DatabaseManager() {
		super();
	}
	
	

}
