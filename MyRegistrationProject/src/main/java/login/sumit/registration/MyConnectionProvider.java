package login.sumit.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnectionProvider implements MyProvider {
	
	static Connection con=null;
	
	public static Connection getCon() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","c##jaya","123456");
			  
			
		}catch(Exception e) {
			System.out.println(e);
		}
	
		return con;
	}

}