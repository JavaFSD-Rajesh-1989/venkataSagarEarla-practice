package com.Twitter.databaseConnections;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {
public static Connection con;
   public  static Connection getConnection() {
	   try {
		   Class.forName("com.mysql.jdbc.Driver");
		   con=DriverManager.getConnection("jdbc:mysql://localhost:3306/revature", "root", "Sagar1212@");
	   }catch(Exception e) {
		   e.printStackTrace();
	   }
	   return con;
   }
}
