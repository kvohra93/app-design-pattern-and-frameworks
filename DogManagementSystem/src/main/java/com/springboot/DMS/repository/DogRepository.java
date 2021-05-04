package com.springboot.DMS.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.DMS.Models.Dog;

public interface DogRepository extends CrudRepository<Dog, Integer>{
	 List<Dog> findByName(String name);
}
