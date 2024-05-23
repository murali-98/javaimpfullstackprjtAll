package com.dxc.springMVC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages ="com.dxc.springMVC.*")
@SpringBootApplication
public class SpringMvcLoginAndRegisterMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcLoginAndRegisterMysqlApplication.class, args);
	System.out.println("hello word!");
	}

}
