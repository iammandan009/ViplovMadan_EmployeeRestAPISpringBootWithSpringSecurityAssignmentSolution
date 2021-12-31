package com.greatLearning.Employee.Employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatLearning.Employee.Employee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	List<Employee> findByfirstNameContainsAllIgnoreCase(String firstName);

}
