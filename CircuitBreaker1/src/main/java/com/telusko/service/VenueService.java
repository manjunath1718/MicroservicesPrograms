package com.telusko.service;

import org.springframework.stereotype.Service;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class VenueService {

//	@CircuitBreaker(name = "VenueCB",fallbackMethod = "venueInfoFallback")
//	public String venueInfo(String match){
//
//		if(match.equalsIgnoreCase("INDvsPAK")) {
//			
//			throw new RuntimeException("Failed to get proper response");
//		}
//				
//		return "Chinnaswamy Stadium Bengaluru";
//	}
//
//	public String venueInfoFallback(String match,Throwable t){
//
//		return "Not yet Decided";
//	}
	
	@CircuitBreaker(name = "VenueCB", fallbackMethod = "venueInfoFallback")
    public String venueInfo(String match) {
       
		if (match.equalsIgnoreCase("INDvsPAK")) {
            try {
                Thread.sleep(5000); // Simulate delay
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            throw new RuntimeException("Failed to get proper response");
        }
        return "Chinnaswamy Stadium Bengaluru";
    }

    public String venueInfoFallback(String match, Throwable t) {
       
    	return "Not yet Decided";
    }
}
