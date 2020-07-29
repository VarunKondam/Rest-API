package com.sample.test.demo.service.impl;

import com.sample.test.demo.domain.Address;
import com.sample.test.demo.domain.Person;
import com.sample.test.demo.service.IService;

public class Serviceimpl implements IService{
	
	@Override
	public String printName(){
	String name = "varun";
	System.out.println(" Reached Service implementation");
	System.out.println("The entered name is " + name);
	return name;
	}
	
	@Override
	public String displayName (String carName) {
		carName = "Volks";
		System.out.println(" "+carName);
		return carName;
	}

	public Person personData() {
	Person person = new Person();
	person.setFirstName("VarunReddy");
	person.setLastName("Kondam");
	person.setHeight(6.2);
	person.setAddress(addressInfo());
	return person;		
	}
	
	private Address addressInfo() {
	Address address = new Address();
	address.setDoornumber(31452);
	address.setCity("Farminton");
	address.setState("Michigan");
	return address;
	}
}
