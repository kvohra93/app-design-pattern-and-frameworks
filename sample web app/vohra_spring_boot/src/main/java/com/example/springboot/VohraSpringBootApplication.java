package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VohraSpringBootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext objCreator = SpringApplication.run(VohraSpringBootApplication.class, args);
	
		Owner o = objCreator.getBean(Owner.class);
		o.setOwnerName("Robbie Dyer");
		Dog d = objCreator.getBean(Dog.class);
		d.setName("leo");
		d.setBreed("french bulldog");
		d.setOwner(o);
		System.out.println("\n"+d.toString());
		
		
		
	}

}
