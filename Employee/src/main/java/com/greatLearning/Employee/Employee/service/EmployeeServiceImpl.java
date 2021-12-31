package com.greatLearning.Employee.Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.greatLearning.Employee.Employee.entity.Employee;
import com.greatLearning.Employee.Employee.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	@Transactional
	public void save(Employee theEmployee) {

		employeeRepository.save(theEmployee);

	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		List<Employee> employee = employeeRepository.findAll();
		return employee;
	}

	@Override
	public Employee findById(int theId) {
		Employee employee = employeeRepository.findById(theId).get();
		return employee;
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);

	}

	@Override
	public List<Employee> searchByName(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> sortEmployee(String sortOrder) {
		List<Employee> employee = null;

		if (sortOrder.contains("asc")) {
			// employee = employeeRepository.FindByOrderByfirstNameAsc();
			employee = employeeRepository.findAll(Sort.by(Sort.Direction.ASC, "firstName"));
		}

		else {
			employee = employeeRepository.findAll(Sort.by(Sort.Direction.DESC, "firstName"));
		}

		return employee;
	}

	@Override
	public List<Employee> searchEmployee(String FirstName) {
		List<Employee> employee = employeeRepository.findByfirstNameContainsAllIgnoreCase(FirstName);
		return employee;
	}

}
