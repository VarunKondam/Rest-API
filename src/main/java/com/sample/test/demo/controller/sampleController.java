package com.sample.test.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.demo.domain.Person;
import com.sample.test.demo.service.impl.Serviceimpl;

@RestController
@RequestMapping("/test")
public class sampleController {
	
	
	@GetMapping("/name")
	public void getName() {
		Serviceimpl serviceimpl = new Serviceimpl();
		serviceimpl.printName();	
	}
	
	@GetMapping("/carname")
	public String getCarName() {
		Serviceimpl service = new Serviceimpl();
		String s = null; 
		s = service.displayName("Volkswagen");
		return s;
	}
	
	@GetMapping("/person")
	public Person getPersonData()
	{
		Serviceimpl service = new Serviceimpl();
		Person p = null;
		p = service.personData();
		return p;		
	}

}


