package com.jnana.employeemanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jnana.employeemanagement.entity.Employee;
import com.jnana.employeemanagement.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private final EmployeeRepository employeeRepo;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	@Override
	public Employee saveEmployee(Employee employee) {
		
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeBYId(Long id) {
		
		return employeeRepo.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		Employee existing = employeeRepo.findById(id).orElse(null);
		
		if(existing!=null) {
			existing.setName(employee.getName());
			existing.setEmail(employee.getEmail());
			existing.setDept(employee.getDept());
			
			return employeeRepo.save(existing);
		}
		return null;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);

	}

}
