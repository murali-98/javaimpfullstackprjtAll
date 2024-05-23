package com.dxc.emp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages= "com.dxc.emp.controller,"
	//	+ "com.dxc.emp.service")

//@ComponentScan(basePackages= "com.dxc.emp.controller")

public class EmpManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagementApplication.class, args);
	}

}
