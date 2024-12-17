package com.example.Employee_Crud_Application.Controller;

import com.example.Employee_Crud_Application.Config.JWTutil;
import com.example.Employee_Crud_Application.DTO.LoginRequest;
import com.example.Employee_Crud_Application.DTO.RegisterRequest;
import com.example.Employee_Crud_Application.Entity.Employee;
import com.example.Employee_Crud_Application.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/register")
    public Employee register(@RequestBody RegisterRequest registerRequest) {
        return employeeService.registerEmployee(registerRequest);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest) {
        if (employeeService.authenticateUser(loginRequest)) {
            return JWTutil.generateToken(loginRequest.getEmail());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}

