package com.telusko.SpringDataJPAssociationMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJPAssociationMapping.model.PhoneNumber;

public interface IPhoneNumberRepo extends JpaRepository<PhoneNumber, Long> {

}
