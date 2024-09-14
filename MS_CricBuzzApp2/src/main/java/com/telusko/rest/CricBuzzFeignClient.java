package com.telusko.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MS-CricBuzzApp1")
public interface CricBuzzFeignClient {

	@GetMapping("/todayMatches")
	public String todayMatches();
	
}
