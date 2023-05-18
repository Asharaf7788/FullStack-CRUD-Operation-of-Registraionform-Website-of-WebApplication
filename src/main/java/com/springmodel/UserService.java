package com.springmodel;

import com.userDao.UserDao;

public class UserService {

	public String createUser(User user){
		
		UserDao userDao = new UserDao();
		
		    String res=userDao.saveUser(user);
		    if(res.equals("success"))
		    {
		    	return "success";
		    }
		    else {
		    	return "No";
		    
		    
	}
	}
	
	public String searchUserEmail(String email){
		
		UserDao userdao= new UserDao();
		String res=userdao.searchUserEmail(email);
		System.out.println(res);
		if(res.equals("yes"))
		{
			return "Success";
		}
		else {
			return "No";
		}
	
    }
	
	public String deleteUser(String email) {
		
		UserDao userdao= new UserDao();
		String res=userdao.deleteUser(email);
		if(res.equals("yes")) {
			return "yes";
		}
		else {
			return "No";
		}
			
	}
	
	public String updateUser(String Email,String name,String email,String password){
		
		System.out.println(Email+" "+name+" "+email+" "+password);
		UserDao userdao= new UserDao();
		String res = userdao.updateUser(Email,name,email,password);
		return res;
		
	}
	
	
	public String searchUserPassword(String Password){
		
		UserDao userdao= new UserDao();
		String res=userdao.searchUserPassword(Password);
		System.out.println(res);
		if(res.equals("yes"))
		{
			return "Success";
		}
		else {
			return "No";
		}
		
	}
}
