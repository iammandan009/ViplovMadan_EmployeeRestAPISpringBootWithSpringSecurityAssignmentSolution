package com.greatLearning.Employee.Employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatLearning.Employee.Employee.entity.Role;
import com.greatLearning.Employee.Employee.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository roleRepository;

	@Override
	@Transactional
	public void saveRole(Role role) {

		roleRepository.save(role);

	}

}
