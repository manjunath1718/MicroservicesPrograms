package com.telusko.SpringDataJPAssociationMapping.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class PhoneNumber {

	@Id
	private Long regNo;
	
	private String provider;
	
	private String type;
	
	@ManyToOne(targetEntity= Person.class, cascade=CascadeType.ALL)
	//@JoinColumn(name="PERSON_ID", referencedColumnName="id")
	private Person person;

	public Long getRegNo() {
		return regNo;
	}

	public void setRegNo(Long regNo) {
		this.regNo = regNo;
	}

	public String getProvider() {
		return provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PhoneNumber() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneNumber(Long regNo, String provider, String type) {
		super();
		this.regNo = regNo;
		this.provider = provider;
		this.type = type;
	}

	@Override
	public String toString() {
		return "PhoneNumber [regNo=" + regNo + ", provider=" + provider + ", type=" + type + ", person=" + person + "]";
	}
	
	

}
