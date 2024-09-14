package com.telusko.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.service.CricbuzzService;

@RestController
public class CricBuzz1Controller {

	@Autowired
	CricbuzzService service;
	
	@GetMapping("/todayMatches")
	public String getTodayMatchInfo(){
		
		return service.getTodayMatches();
	}
}
