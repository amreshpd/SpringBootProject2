package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConection {
	private static Connection con = null;

	private DBConection() {
	}

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(IDBInfo.URL, IDBInfo.USER, IDBInfo.PWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getCon() {
		return con;
	}
}
