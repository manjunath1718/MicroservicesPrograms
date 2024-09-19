package com.telusko.SpringDataJPAssociationMapping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJPAssociationMapping.model.Person;
import com.telusko.SpringDataJPAssociationMapping.model.PhoneNumber;
import com.telusko.SpringDataJPAssociationMapping.repo.IPersonRepo;
import com.telusko.SpringDataJPAssociationMapping.repo.IPhoneNumberRepo;

@Service
public class PersonManServiceImpl implements IPersonManagementService {

	@Autowired
	private IPersonRepo repo1;
	
	@Autowired
	private IPhoneNumberRepo repo2;
	
	@Override
	public String savePerson(Person person) {
	
		Integer pid=repo1.save(person).getId();
		return "Person and Phone Number info saved with id "+ pid;
	}

	@Override
	public String savePhoneNumbers(Iterable<PhoneNumber> numbers) {
		
		for(PhoneNumber numberInfo:numbers){
		
			repo2.save(numberInfo);
		}
		
		return "Phone numbers detail with person is saved";
	}

}
