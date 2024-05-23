package com.am.restfullapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.am.restfullapi.dto.EmployeeDto;
import com.am.restfullapi.dto.mapper.EmployeeDtoMapper;
import com.am.restfullapi.entity.Employee;
import com.am.restfullapi.exception.DatabaseEmptyException;
import com.am.restfullapi.exception.EmployeeNotFoundException;
import com.am.restfullapi.service.EmployeeService;



@RestController
@RequestMapping("/")
public class EmployeeController{ 
	
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private EmployeeDtoMapper employeeDtoMapper;
	
	@GetMapping("employees/")
    public ResponseEntity<?> getAllEmployees() throws DatabaseEmptyException{
    	List<Employee> list = employeeService.getAllEmployees();
    	List<EmployeeDto> dtoList = employeeDtoMapper.employeesToDtos(list);
    	return new ResponseEntity<List<EmployeeDto>>(dtoList,HttpStatus.ACCEPTED);
    	
    }
	
	@GetMapping("employees/{id}")
    public ResponseEntity<?> getEmployee(@PathVariable("id") int id) throws EmployeeNotFoundException{
    	Employee emp = employeeService.getEmployee(id);
    	EmployeeDto empDto = employeeDtoMapper.employeeToDto(emp);
    	
    	return new ResponseEntity<EmployeeDto>(empDto,HttpStatus.ACCEPTED);
    }
	
	@PostMapping("employees/")
    public ResponseEntity<?> postEmployee(@RequestBody EmployeeDto employeeDto){
		
    	Employee emp = employeeDtoMapper.dtoToemployee(employeeDto);
    	emp = employeeService.saveEmployee(emp);
    	EmployeeDto empDto = employeeDtoMapper.employeeToDto(emp);
    	
    	return new ResponseEntity<EmployeeDto>(empDto,HttpStatus.ACCEPTED);
    }
	
	@PutMapping("employees/")
    public ResponseEntity<?> putEmployee(@RequestBody EmployeeDto employeeDto) throws EmployeeNotFoundException{
		
    	Employee emp = employeeDtoMapper.dtoToemployee(employeeDto);
    	emp = employeeService.updateEmployee(emp);
    	EmployeeDto empDto = employeeDtoMapper.employeeToDto(emp);
    	
    	return new ResponseEntity<EmployeeDto>(empDto,HttpStatus.ACCEPTED);
    }
	
	@DeleteMapping("employees/{id}")
    public ResponseEntity<?> putEmployee(@PathVariable("id") int id) throws EmployeeNotFoundException{
		Employee emp = employeeService.deleteEmployee(id);
		EmployeeDto empDto = employeeDtoMapper.employeeToDto(emp);
    	return new ResponseEntity<EmployeeDto>(empDto,HttpStatus.ACCEPTED);
    }
	
//	@RequestMapping("*")
//    public ResponseEntity<?> allUrl(){
//    	return new ResponseEntity<String>(new String("Wrong url, please give correct url"),HttpStatus.ACCEPTED);
//    }
	
}
