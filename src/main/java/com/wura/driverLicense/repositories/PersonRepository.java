package com.wura.driverLicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wura.driverLicense.models.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
