package com.example.springbootAppRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootAppRestAPI.entity.Employee;
import com.example.springbootAppRestAPI.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired
	EmployeeRepository employeeRepository;
	
	
    @PostMapping
	public Employee saveEmployee(@RequestBody Employee employee)
	 {
		  return employeeRepository.save(employee);	 
	 }
    
    @PutMapping
   	public Employee updateEmployee(@RequestBody Employee employee)
   	 {
   		  return employeeRepository.save(employee);	 
   	 }
    
    @DeleteMapping
   	public String deleteEmployee(@RequestParam Integer empId)
   	 {
   		   employeeRepository.deleteById(empId);
   		   return "deleted Successfully";
   	 }
	 
    @GetMapping("/findAll")
   	public List<Employee> getAllEmployee(@RequestBody Employee employee)
   	 {
   		  return employeeRepository.findAll(); 
   	 }
    
    @GetMapping
   	public Employee getEmployeeById(@RequestParam Integer empId)
   	 {
   		  return employeeRepository.findById(empId).get();
   	 }
    
   	 

}
	 

