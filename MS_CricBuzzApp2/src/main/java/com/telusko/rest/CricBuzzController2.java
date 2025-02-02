package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CricBuzzController2 {
	
	@Autowired
	private CricBuzzFeignClient feignClient;

	@GetMapping("/winProbability")
	public String getSomeMoreInfo(){
		
//		RestTemplate restTemplate=new RestTemplate();
//		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://localhost:8484/todayMatches", String.class);
//		String apiResponse = responseEntity.getBody();
		String apiResponse =feignClient.todayMatches();
		
		return apiResponse+" Win probability : IND-60% and AUS-40%";
	}
}
