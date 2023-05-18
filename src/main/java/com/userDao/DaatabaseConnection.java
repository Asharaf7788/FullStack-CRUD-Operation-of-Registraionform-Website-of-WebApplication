package com.userDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DaatabaseConnection {
	
	public static Connection getConnection()
	{
		
		  Connection con=null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			 String password="12345678";
			 String url = "jdbc:mysql://localhost:3306/myapp";
			String user="root";
			
			 con= DriverManager.getConnection(url,user,password);
		
			}
			 catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch(ClassNotFoundException e) {
				e.printStackTrace();
			}
			return con;
			
	}
	  


}
