package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsCricBuzzApp1Application {

	public static void main(String[] args) {
		SpringApplication.run(MsCricBuzzApp1Application.class, args);
	}

}
