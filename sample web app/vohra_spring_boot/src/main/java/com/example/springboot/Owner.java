package com.example.springboot;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope ("prototype")
@Component
public class Owner {
	
	private String ownerName;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	

}
