package com.telusko.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CricbuzzService {

	@Autowired
	Environment envi;
	
	public String getTodayMatches(){
		
		String portNo = envi.getProperty("server.port");
		return "PortNo -> "
				+portNo +" IND vs AUS Today 11:00 pm T20 1 of 3";
	}
}
