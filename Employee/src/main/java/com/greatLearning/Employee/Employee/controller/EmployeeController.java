package com.greatLearning.Employee.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.greatLearning.Employee.Employee.entity.Employee;

import com.greatLearning.Employee.Employee.service.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeServiceImpl employeeServiceImpl;

	@GetMapping("/list")
	public List<Employee> listAll() {

		return employeeServiceImpl.findAll();
	}

	@GetMapping("/listById/{id}")
	public Employee findById(@PathVariable int id) {
		Employee employee = employeeServiceImpl.findById(id);
		return employee;
	}

	@PostMapping("/add")
	public Employee save(@RequestBody Employee employee)

	{
		int id = employee.getId();
		;
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String emailId = employee.getEmailId();
		Employee employee1;

		if (id != 0) {
			employee1 = employeeServiceImpl.findById(id);
			employee1.setFirstName(firstName);
			employee1.setLastName(lastName);
			employee1.setEmailId(emailId);

		} else {
			employee1 = new Employee(firstName, lastName, emailId);
		}

		employeeServiceImpl.save(employee1);

		return employee1;

	}

	@PostMapping("/deleteById/{id}")
	public String deleteById(@PathVariable int id) {
		employeeServiceImpl.deleteById(id);

		return ("Deleted Employe with Id " + id);
	}

	@GetMapping("/sort")
	public List<Employee> sortEmployees(@RequestParam("order") String order) {
		List<Employee> employee = employeeServiceImpl.sortEmployee(order);
		return employee;
	}

	@GetMapping("/findByName/{firstName}")
	public List<Employee> findByName(@PathVariable String firstName) {
		List<Employee> employee = employeeServiceImpl.searchEmployee(firstName);
		return employee;
	}

}
