package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static Connection con=null;
	private DBConnection() {}
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(IDBInfo.DBURL,IDBInfo.USER,IDBInfo.PASSWORD);
		}catch (Exception e) {
			System.out.println(e.toString());
		}
	}	
	public static Connection getCon() {
		return con;		
	}
}
