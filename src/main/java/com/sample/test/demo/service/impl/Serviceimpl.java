package com.sample.test.demo.service.impl;

import com.sample.test.demo.service.IService;

public class Serviceimpl implements IService{
	
	public void printName (String name){
	name = "varun";
	System.out.println(" Reached Service implementation");
	System.out.println("The entered name is " + name);
	}
}
