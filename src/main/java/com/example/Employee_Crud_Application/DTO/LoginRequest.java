package com.example.Employee_Crud_Application.DTO;

import lombok.Data;

@Data
public class LoginRequest {

    private String email;
    private String password;
}