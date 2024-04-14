package com.example.employeemanagement.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection="user")
public class EmployeeResponse {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
}
