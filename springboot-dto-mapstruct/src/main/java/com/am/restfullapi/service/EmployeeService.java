package com.am.restfullapi.service;

import java.util.List;

import com.am.restfullapi.entity.Employee;
import com.am.restfullapi.exception.DatabaseEmptyException;
import com.am.restfullapi.exception.EmployeeNotFoundException;

public interface EmployeeService {
	public List<Employee> getAllEmployees() throws DatabaseEmptyException;
	public Employee saveEmployee(Employee employee);
	public Employee getEmployee(int id) throws EmployeeNotFoundException;
	public Employee deleteEmployee(int id) throws EmployeeNotFoundException;
	public Employee updateEmployee(Employee employee) throws EmployeeNotFoundException;
	
}
