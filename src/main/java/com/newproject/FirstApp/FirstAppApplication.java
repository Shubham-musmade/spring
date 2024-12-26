package com.newproject.FirstApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FirstAppApplication {

	public static void main(String[] args) {

		//Using ApplicationContext to get the bean and bean are the objects that are created by spring container
		ApplicationContext context = SpringApplication.run(FirstAppApplication.class, args);

		//Getting the bean of Human class
		// Definition of bean in sping is a class that is managed by spring container
		Human obj = context.getBean(Human.class);
		obj.Person();
	}

}
