package com.userDao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


import com.springmodel.User;


public class UserDao {
	
  Connection con;
  
	
	public String saveUser(User user){
		
		
		
		con=DaatabaseConnection.getConnection();
		   
		   try {
			   String sql= "INSERT INTO user(name,email,password) VALUES(?,?,?)";
			   PreparedStatement prestmt = con.prepareStatement(sql);
			   prestmt.setString(1,user.getName());
			   prestmt.setString(2,user.getEmail());
			   prestmt.setString(3,user.getPassword());
			   prestmt.executeUpdate();
			   
			   return "success";
		} catch (SQLException e) {

			e.printStackTrace();
			return e.getMessage();
		}
	}
	
	public String searchUserEmail(String Email){
		
		 int u_id=0;
		 
		con=DaatabaseConnection.getConnection();
		 try {
			   
			 String sql = "SELECT id FROM user WHERE email = ?";
				PreparedStatement stmt = con.prepareStatement(sql);
				stmt.setString(1,Email);
				ResultSet result = stmt.executeQuery();
				while(result.next())
				{
					u_id=result.getInt(1);
					
				}
				System.out.println(u_id);
				if(u_id >0) {
					return "yes";
				}
				else {
					return"No";
				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				return e.getMessage();
			}
			
		
		
	}
	
	public String deleteUser(String Email){
		
		con=DaatabaseConnection.getConnection();
		
		try {
			String sql ="DELETE FROM user WHERE email = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1,Email);
			stmt.executeUpdate();
			
			return "yes";
		} catch (SQLException e) {
			
			e.printStackTrace();
			return "No";
		}
	}
	
	public String updateUser(String Email,String name,String email,String password){
	
		
		try {
			
		     if(!name.isEmpty()){
		    	 
		    	 System.out.println(name);
		    	 con=DaatabaseConnection.getConnection();
			    String sql1 = "UPDATE user SET name=? WHERE email=?";
			
				PreparedStatement stmt = con.prepareStatement(sql1);
		         stmt.setString(1,name);
		         stmt.setString(2,Email);
		         stmt.executeUpdate();
		    }
		     
		     if(!email.isEmpty()){
		    	 
		    	 System.out.println(email);
		    	 con=DaatabaseConnection.getConnection();
				    String sql2 = "UPDATE user SET email=? WHERE email=?";
				
					PreparedStatement stmt = con.prepareStatement(sql2);
			         stmt.setString(1,email);
			         stmt.setString(2,Email);
			         stmt.executeUpdate();
			         
			    }
		     if(!password.isEmpty()){
		    	 
		    	 System.out.println(password);
		    	   con=DaatabaseConnection.getConnection();
				    String sql3 = "UPDATE user SET password=? WHERE email=?";
				
					PreparedStatement stmt = con.prepareStatement(sql3);
			         stmt.setString(1,password);
			         stmt.setString(2,Email);
			         stmt.executeUpdate();
			    }
		     
		     return"yes";
		}
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	    
		return "yes";
	}
	
	public String searchUserPassword(String password){
		
		 int p_id=0;
		 
			con=DaatabaseConnection.getConnection();
			 try {
				   
				 String sql = "SELECT id FROM user WHERE Password = ?";
					PreparedStatement stmt = con.prepareStatement(sql);
					stmt.setString(1,password);
					ResultSet result = stmt.executeQuery();
					while(result.next())
					{
						p_id=result.getInt(1);
						
					}
					System.out.println(p_id);
					if(p_id >0) {
						return "yes";
					}
					else {
						return"No";
					}
					
					
				} catch (SQLException e) {
					e.printStackTrace();
					return e.getMessage();
				}
		
		
	}
	
		

}
