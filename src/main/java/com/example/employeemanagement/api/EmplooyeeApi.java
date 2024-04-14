package com.example.employeemanagement.api;

import com.example.employeemanagement.response.EmployeeResponse;
import com.example.employeemanagement.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("/funcionarios")
public class EmplooyeeApi {

    private EmployeeService service;

    @PostMapping("/{register}")
    public EmployeeResponse registerEmployee(@RequestBody EmployeeResponse response) {
        return service.registerEmployee(response);
    }

    @GetMapping("/{id}")
    public Optional<EmployeeResponse> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @GetMapping
    public List<EmployeeResponse> findAll() {
        return service.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable String id) {
        service.deleteById(id);
    }
}
