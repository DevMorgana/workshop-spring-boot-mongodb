package com.example.employeemanagement.repository;

import com.example.employeemanagement.response.EmployeeResponse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmplooyeeRepository extends MongoRepository<EmployeeResponse, String> {

}
