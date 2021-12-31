package com.greatLearning.Employee.Employee.service;

import java.util.List;

import com.greatLearning.Employee.Employee.entity.*;

public interface EmployeeService {

	public void save(Employee theEmployee);

	public List<Employee> findAll();

	public Employee findById(int theId);

	public void deleteById(int theId);

	public List<Employee> searchByName(String firstName);

	public List<Employee> sortEmployee(String sortOrder);

	public List<Employee> searchEmployee(String FirstName);

}
