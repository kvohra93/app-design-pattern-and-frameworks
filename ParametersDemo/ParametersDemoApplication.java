package com.springboot.ParametersDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//http://localhost:8080/display?dogId=123&dogName=puppy&dogBreed=lab
	
	
@SpringBootApplication
public class ParametersDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParametersDemoApplication.class, args);
	}

}
