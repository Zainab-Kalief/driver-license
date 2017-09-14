package com.wura.driverLicense.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.wura.driverLicense.models.License;

@Repository
public interface LicenseRepository extends CrudRepository<License, Long>{

}
