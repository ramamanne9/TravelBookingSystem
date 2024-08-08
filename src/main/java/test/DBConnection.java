package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

	public static Connection con=null;
	public static Connection getCon() {
		 try{  
				Class.forName("oracle.jdbc.driver.OracleDriver");  
				
			     
				con  = DriverManager.getConnection(DBInfo.url, DBInfo.username, DBInfo.password);
				

		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return con;
	}
	
	
}
