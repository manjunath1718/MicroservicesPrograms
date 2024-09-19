package com.telusko.SpringDataJPAssociationMapping.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String name;
	
	private String city;
	
	@OneToMany(targetEntity= PhoneNumber.class, cascade=CascadeType.ALL, mappedBy="person")
	//@JoinColumn(name="PERSON_ID", referencedColumnName="id")
	private Set<PhoneNumber> contactDetails;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<PhoneNumber> getContactDetails() {
		return contactDetails;
	}

	public void setContactDetails(Set<PhoneNumber> contactDetails) {
		this.contactDetails = contactDetails;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person( String name, String city, Set<PhoneNumber> contactDetails) {
		super();
		
		this.name = name;
		this.city = city;
		this.contactDetails = contactDetails;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", city=" + city + ", contactDetails=" + contactDetails + "]";
	}
	
	
	
	

}
