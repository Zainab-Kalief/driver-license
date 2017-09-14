package com.wura.driverLicense.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.wura.driverLicense.models.License;
import com.wura.driverLicense.models.Person;
import com.wura.driverLicense.repositories.LicenseRepository;
import com.wura.driverLicense.repositories.PersonRepository;

@Service
public class DriverService {
	private LicenseRepository licenseRepository;
	private PersonRepository personRepository;
	
	public DriverService(LicenseRepository licenseRepository, PersonRepository personRepository) {
		this.licenseRepository = licenseRepository;
		this.personRepository = personRepository;
	}
	
	public List<Person> allPersons() {
		return (List<Person>)  personRepository.findAll();
	}
	public void addPerson(Person person) {
		personRepository.save(person);
	}
	public License findLicense(Long id) {
		return licenseRepository.findOne(id);
	}
	
	public List<License> all() {
		return (List<License>) licenseRepository.findAll();
	}
	public void addLicense(License license) {
		licenseRepository.save(license);
	}
}
