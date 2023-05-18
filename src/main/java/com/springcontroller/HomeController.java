package com.springcontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.springmodel.User;
import com.springmodel.UserService;

@Controller
public class HomeController {
	
	 String Email;
	
	@RequestMapping("/")
	public String contact(Model model) {
		
		model.addAttribute("res1","");
		return "contact";
	}	
	
  /*fetching the data by using @RequestParam annotation//
	@RequestMapping("/process")
	public String process(
	@RequestParam("name")String user_name,
	@RequestParam("email")String user_email,
	@RequestParam("password")String user_password,Model model
	){
		
		model.addAttribute("name",user_name);
		model.addAttribute("email",user_email);
		model.addAttribute("password",user_password);
		System.out.println("the User Name is : "+user_name);
		System.out.println("the User Email is : "+user_name);
		System.out.println("the User Password is : "+user_password);
		return "success";
	} */
	
	
	
	//Fetching the data by using @ModelAttribute Annotation very important Approach //
	@RequestMapping("/signinview")
	public String signinProcessView(){
		
		return "signin";
		
		
	}
	
	@RequestMapping("/signprocess")
	public String signinProcessData(@RequestParam("email")String user_email,
			@RequestParam("password")String user_password,Model model){
		    Email=user_email;
			model.addAttribute("res5","");
			UserService userservice1 = new UserService();
			 String res1 = userservice1.searchUserEmail(user_email);
			 UserService userservice2 = new UserService();
			 String res2 = userservice2.searchUserPassword(user_password);
			 if(res1.equals("Success") && res2.equals("Success")) {
				return "success";
			}
			else if(res1.equals("No")) {
				model.addAttribute("res5","Email not Exists Register!!");
				return "signin";
			}
			else if(res2.equals("No")) {
			model.addAttribute("res6","Password Incorrect");
			return "signin";
			}
		
			 return "signin";
		
		
		
		
	}
	
	
	
	
	
	
	@RequestMapping(path="/signupprocess",method=RequestMethod.POST)
	public String handleFormData(@ModelAttribute User user,Model model){
	
		Email=user.getEmail();
		model.addAttribute("nm",user.getName());
		
	 UserService userservice = new UserService();
         String res=userservice.createUser(user);
         if(res.equals("success")) {
 			return "success";
 		}
         else if(res.equals("No")){
 			model.addAttribute("res1","Email already Exits Signin!!");
 			return "contact";
         }
         
 		return"contact";
 	
	}

	@RequestMapping("/searchprocess")
	public String searchData(@RequestParam("email")String user_email,Model model){
        
        if(!user_email.equals(Email)) {
			model.addAttribute("res2","Incorrect Email!!");
			return "success";
		}
     
		UserService userservice = new UserService();
		 String res =userservice.searchUserEmail(user_email);
		 
		if(res.equals("Success")) {
			return "update";
		}
		else if(res.equals("No")) {
			model.addAttribute("res2","Incorrect Email!!");
			return "success";
		}
		return "success";
		
	}
	
	@RequestMapping("/deleteprocess")
	public String deleteUser(@RequestParam("email")String user_email,Model model) {
		
		if(!user_email.equals(Email)) {
			model.addAttribute("res3","Incorrect Email!!");
			return "success";
		}
		
		UserService userservice = new UserService();
		String res=userservice.deleteUser(user_email);
		if(res.equals("yes")) {
			model.addAttribute("res3","Successfully deleted!!");
			return "success";
			
		}
		return "success";
		
	}
	
	@RequestMapping("/updateprocess")
	public String updateUser(@RequestParam("newname")String user_name,
			@RequestParam("newemail")String user_email,
			@RequestParam("newpassword")String user_password,Model model){
		
		  if(user_email.isEmpty()&&user_name.isEmpty()&& user_password.isEmpty()) {
			  model.addAttribute("res4","Nothing Updated");
			  return "update";
		  }
		
		  UserService userservice = new UserService();
		 
		  String EmailId=Email;
		   String res = userservice.updateUser(EmailId,user_name,user_email,user_password);
		     if(res.equals("yes")){
		    	 model.addAttribute("res4","Successfully Updated");
		     }
		  
		
		return "update";		
	}
	
	
	@ModelAttribute
	public void commonDataPrinting(Model model){
		model.addAttribute("heading","Welcome to Registration");
		model.addAttribute("paragraph","We'll never share your personal with anyone else.");
		
	}
	

}
