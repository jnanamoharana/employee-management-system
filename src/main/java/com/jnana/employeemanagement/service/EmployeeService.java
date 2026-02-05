package com.jnana.employeemanagement.service;

import java.util.List;

import com.jnana.employeemanagement.entity.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployees();
	
	Employee getEmployeeBYId(Long id);
	
	Employee updateEmployee(Long id, Employee employee);
	
	void deleteEmployee(Long id);

}
