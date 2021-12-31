package com.greatLearning.Employee.Employee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatLearning.Employee.Employee.entity.User;
import com.greatLearning.Employee.Employee.service.UserInfoSaveServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	
	
	 @Autowired
	    PasswordEncoder passwordEncoder;
	 
	 @Autowired
	 UserInfoSaveServiceImpl userSave;
	
	@PostMapping("/save")
	public String saveUser(@RequestBody User user)
	
	{
		
	    
	    User user1= new User();
	    
	    user1.setUsername(user.getUsername());
	    user1.setPassword(passwordEncoder.encode(user.getPassword()));
	    user1.setRoles(user.getRoles());
	    userSave.saveUser(user1);
	    
	    return "User Saved Successfully";
		
	}
	

}
