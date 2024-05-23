package com.am.restfullapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.am.restfullapi.dto.mapper.EmployeeDtoMapper;

@SpringBootApplication
public class SpringbootRestfullApi2Application {
	@Autowired
    private static EmployeeDtoMapper employeeDtoMapper;
	public static void main(String[] args) {
		SpringApplication.run(SpringbootRestfullApi2Application.class, args);
		System.out.println(employeeDtoMapper);
		
	}

	 @Autowired
	 public void setEmployeeDtoMapper(EmployeeDtoMapper employeeDtoMapper) {
		 this.employeeDtoMapper = employeeDtoMapper;
	 }
}
