package com.greatLearning.Employee.Employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.Employee.Employee.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {

}
