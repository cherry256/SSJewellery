package com.ssjewellery.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "Hello! I'm doing good!!";
	}
}
