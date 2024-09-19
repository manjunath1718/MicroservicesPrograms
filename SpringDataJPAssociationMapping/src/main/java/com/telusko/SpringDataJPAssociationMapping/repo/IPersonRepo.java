package com.telusko.SpringDataJPAssociationMapping.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.SpringDataJPAssociationMapping.model.Person;

public interface IPersonRepo extends JpaRepository<Person, Integer> {

}
