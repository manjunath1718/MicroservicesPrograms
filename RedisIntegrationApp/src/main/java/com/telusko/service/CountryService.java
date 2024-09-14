package com.telusko.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.telusko.model.Country;

@Service
public class CountryService {

	HashOperations<String, String, Country> opsForhash;

	public CountryService(RedisTemplate<String, Country> redisTemplate) {
		
		this.opsForhash = redisTemplate.opsForHash();
	}
	
	public String addCountry(Country country) {
		
		opsForhash.put("COUNTRIES", country.getCountryCode(), country);
		return "Country Info Added";		
	}
	
	public Collection<Country> getCountries(){
		
		Map<String, Country> allCountries = opsForhash.entries("COUNTRIES");
		
		return allCountries.values();
	}
}
