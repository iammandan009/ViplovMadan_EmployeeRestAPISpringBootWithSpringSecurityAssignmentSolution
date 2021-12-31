package com.greatLearning.Employee.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.greatLearning.Employee.Employee.entity.User;
import com.greatLearning.Employee.Employee.repository.UserRepository;

@Service
public class UserInfoSaveServiceImpl {
	
	@Autowired
	UserRepository userRepository;
	
	public void saveUser(User user)
	{
	   userRepository.save(user);
	   
	}
	
	

}
