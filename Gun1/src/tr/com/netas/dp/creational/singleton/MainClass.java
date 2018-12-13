package tr.com.netas.dp.creational.singleton;

public class MainClass {

	public static void main(String[] args) {
		
		DatabaseManager dbManager =  DatabaseManager.newInstance();
		
		dbManager.setUsername("root");
		
		
		
		
		DatabaseManager dbManager2 = DatabaseManager.newInstance();
		
		
		System.out.println(dbManager2.getUsername());
		
		

	}

}
