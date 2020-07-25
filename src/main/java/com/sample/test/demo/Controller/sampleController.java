package com.sample.test.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.test.demo.service.impl.Serviceimpl;

@RestController
@RequestMapping("/test")
public class sampleController {
	
	
	@GetMapping("/name")
	public void getName() {
		Serviceimpl serviceimpl = new Serviceimpl();
		serviceimpl.printName("Veyron");
	}
	

}
