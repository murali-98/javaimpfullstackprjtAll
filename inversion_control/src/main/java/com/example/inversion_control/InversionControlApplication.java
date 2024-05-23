package com.example.inversion_control;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InversionControlApplication {

	public static void main(String[] args) {
		/*SpringApplication.run(InversionControlApplication.class, args);
		
		Mobiles obj = new Oneplus();
		obj.getModelAndColor(); */
		
		//Spring brean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		//using bean 
		Mobiles obj = context.getBean("getIphoneObject",Mobiles.class);//new IPhone();
		obj.getModelAndColor();
	}

}
