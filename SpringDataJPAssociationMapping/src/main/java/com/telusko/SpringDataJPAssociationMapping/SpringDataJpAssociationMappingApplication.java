package com.telusko.SpringDataJPAssociationMapping;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.telusko.SpringDataJPAssociationMapping.model.Person;
import com.telusko.SpringDataJPAssociationMapping.model.PhoneNumber;
import com.telusko.SpringDataJPAssociationMapping.service.IPersonManagementService;

@SpringBootApplication
public class SpringDataJpAssociationMappingApplication implements CommandLineRunner{

	@Autowired
	private IPersonManagementService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpAssociationMappingApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
	     		
		Person p1=new Person();
		p1.setName("Rajesh");
		p1.setCity("Bengaluru");
		
		PhoneNumber pN1=new PhoneNumber(4545457L, "JIO", "perosnal");
		PhoneNumber pN2=new PhoneNumber(45454746357L, "Vodafone", "profesional");
		pN1.setPerson(p1);
		pN2.setPerson(p1);
		
		Set<PhoneNumber> contactNumbers = Set.of(pN1, pN2);
		
		p1.setContactDetails(contactNumbers);
		
	//	String status=service.savePerson(p1);
		
		String status=service.savePhoneNumbers(contactNumbers);
		System.out.println(status);
		
		
		
		
		
		
	}

}
