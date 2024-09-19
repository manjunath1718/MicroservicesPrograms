package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@SpringBootApplication
public class CircuitBreaker1Application {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreaker1Application.class, args);
	}

}
