package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope ("prototype")
public class Dog {

	private String name;
	private String breed;
	@Autowired
	private Owner owner;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "This is " + name + " and it is a " + breed + " .Their owner is " +
	owner.getOwnerName();
	}
	
	
	
	
}
