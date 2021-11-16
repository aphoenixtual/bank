package banking;

import java.sql.Connection;
import java.sql.DriverManager;
// Globel connection Class
public class connection {
	static Connection con; // Globel Connection Object
	public static Connection getConnection()
	{
		try {
			
			
			String mysqlJDBCDriver
				= "com.mysql.cj.jdbc.Driver"; //jdbc driver
			String url= "jdbc:mysql://localhost:3306/bank?autoReconnect=true&useSSL=false"; //mysql url
			String user = "root";	 //mysql username
			String pass = "ayushp264"; //mysql passcode
			Class.forName(mysqlJDBCDriver);
			con = DriverManager.getConnection(url, user,pass);
		}
		catch (Exception e) {
			System.out.println("Connection Failed!");
		}

		return con;
	}
}
