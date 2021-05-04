package com.springboot.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Dog {
	/*
	 * id field primary key in Dog table
	 */
	@Id
	private int id;
	/*
	 * dog object's name
	 */
	private String name;
	/*
	 * dog's breed is stored here
	 */
	private String breed;
		@ManyToOne
	private Trainer trainer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer + "]";
	}
	


}
