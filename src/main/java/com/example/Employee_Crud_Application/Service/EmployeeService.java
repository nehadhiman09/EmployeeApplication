package com.example.Employee_Crud_Application.Service;

import com.example.Employee_Crud_Application.DTO.LoginRequest;
import com.example.Employee_Crud_Application.DTO.RegisterRequest;
import com.example.Employee_Crud_Application.Entity.Employee;
import com.example.Employee_Crud_Application.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private  EmployeeRepository employeeRepository;



    //create a employee
    public Employee createemployee(Employee employee)
    {
        return employeeRepository.save(employee);
    }
    //Fetch all employees
    public List<Employee> getallemployees()
    {
        return  employeeRepository.findAll();
    }
    //Fetch employee by id
    public Optional<Employee> getemployeebyid(Long id)
    {
        return employeeRepository.findById(id);
    }
    //update existing employee
    public Employee updateemployee(Long id, Employee employee)
    {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null; // Or throw an exception if not found
    }
    //delete employee
    public void deleteemployee(Long id)
    {
        employeeRepository.deleteById(id);
    }
}


