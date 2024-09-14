package com.telusko.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquadController {

	@Value("${squad}")
	private String indianSquad;
	
	@GetMapping("/indsquad")
	public String squadInfoOfIND() {
		
		return indianSquad;
	}
}
