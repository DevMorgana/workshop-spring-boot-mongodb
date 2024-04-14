package com.example.employeemanagement.service;

import com.example.employeemanagement.repository.EmplooyeeRepository;
import com.example.employeemanagement.response.EmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@AllArgsConstructor
public class EmployeeService {

    private final EmplooyeeRepository repository;

    public EmployeeResponse registerEmployee(EmployeeResponse response) {
        return repository.save(response);
    }

    public List<EmployeeResponse> findAll( ) {
       return repository.findAll();
    }

    public Optional<EmployeeResponse> findById(String id) {
        return repository.findById(id);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
