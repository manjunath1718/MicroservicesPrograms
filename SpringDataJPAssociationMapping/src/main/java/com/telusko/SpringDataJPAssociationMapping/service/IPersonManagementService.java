package com.telusko.SpringDataJPAssociationMapping.service;

import com.telusko.SpringDataJPAssociationMapping.model.Person;
import com.telusko.SpringDataJPAssociationMapping.model.PhoneNumber;

public interface IPersonManagementService {
	
	public String savePerson(Person person);
	
	public String savePhoneNumbers(Iterable<PhoneNumber>numbers);

}
