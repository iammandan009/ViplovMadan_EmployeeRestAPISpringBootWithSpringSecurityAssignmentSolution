package com.greatLearning.Employee.Employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.greatLearning.Employee.Employee.entity.Role;
import com.greatLearning.Employee.Employee.service.RoleServiceImpl;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleServiceImpl roleServiceImpl;

	@PostMapping("/save")
	public String saveRole(@RequestBody Role role) {
		Role role1 = new Role();
		role1.setName(role.getName());

		roleServiceImpl.saveRole(role1);
		return "Role Created Successfully";
	}

}
