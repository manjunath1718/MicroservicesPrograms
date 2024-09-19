package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.VenueService;

@RestController
public class CBController {

	@Autowired
	VenueService service;
	
	@GetMapping("/stadium/{match}")
	public String venue(@PathVariable String match) {
		
		return service.venueInfo(match);
	}
}
