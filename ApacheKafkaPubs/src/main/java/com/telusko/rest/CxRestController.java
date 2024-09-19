package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.model.Customer;
import com.telusko.service.KafkaService;

@RestController
public class CxRestController {

	@Autowired
	private KafkaService service;
	
	@PostMapping("/addCx")
	public String addCx(@RequestBody Customer cx) {
		
		return service.addCxMsg(cx);
	}
}
