package com.springboot.DMS.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.springboot.DMS.Models.Dog;
import com.springboot.DMS.repository.DogRepository;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DogController {

	ModelAndView mv = new ModelAndView();
	@Autowired
	DogRepository d;

	/*
	 * using string return type public String home() {
	 * 
	 * return "home.html"; }
	 */

	/*
	 * returning ModelAndView object type
	 */

	@RequestMapping("dogHome")
	public ModelAndView home() {
		mv.setViewName("home");
		return mv;

	}

	@RequestMapping("add")
	public ModelAndView add() {
		mv.setViewName("addNewDog.html");
		return mv;
	}

	@RequestMapping("addNewDog")

	public ModelAndView addNewDog(Dog dog) {
		d.save(dog);
		mv.setViewName("home");

		return mv;
	}

	@RequestMapping("viewModifyDelete")
	public ModelAndView viewDogs() {
		mv.setViewName("viewDogs");
		Iterable<Dog> dogs = d.findAll();
		mv.addObject("dogs", dogs);
		return mv;
	}

	@RequestMapping("editDog")
	public ModelAndView editDog(Dog dog) {
		d.save(dog);
		mv.setViewName("editDog");
		return mv;
	}

	@RequestMapping("deleteDog")
	public ModelAndView deleteDog(Dog dog) {
		/*
		 * deleting dog based on id Optional<Dog> od= d.findById(dog.getId()); if
		 * (od.isPresent() ) { d.delete(dog); } mv.setViewName("editDog"); return
		 * home();
		 */
		// deleting based on name
		/*
		 * List<Dog> dogsFound = d.findByName(dog.getName()); for (Dog item : dogsFound)
		 * {
		 * 
		 * d.delete(item); } return home();
		 */
		Dog dawg = d.findById(dog.getId()).orElse(new Dog());
		d.delete(dawg);
		return home();
	}

	@RequestMapping("search")
	public ModelAndView searchById(int id) {
		Dog dawg = d.findById(id).orElse(new Dog());
		mv.addObject(dawg);
		mv.setViewName("searchResults");
		return mv;

	}

}
