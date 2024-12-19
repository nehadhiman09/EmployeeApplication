package com.example.Employee_Crud_Application.Controller;

import com.example.Employee_Crud_Application.Entity.Employee;
import com.example.Employee_Crud_Application.Service.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // Create a new employee
    @Operation(summary = "Create a new employee", description = "Create a new employee record")
    @PostMapping("/emp")
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
        Employee createdEmployee = employeeService.createemployee(employee);
        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
    }

    @Operation(summary = "Get all employees", description = "Fetch all employees from the database")
    // Get all employees
    @GetMapping("/allemp")
    public ResponseEntity<List<Employee>> getEmployees() {
        List<Employee> employees = employeeService.getallemployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }
    @Operation(summary = "Get employee by ID", description = "Fetch an employee by their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Found the employee"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    // Get employee by ID
    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
        Optional<Employee> employee = employeeService.getemployeebyid(id);
        if (employee.isPresent()) {
            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    // Update existing employee
    @Operation(summary =  "Update employee by ID", description = "Update an employee by their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Update employee"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
        Employee updatedEmployee = employeeService.updateemployee(id, employee);
        if (updatedEmployee != null) {
            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK); // Return updated employee with status 200
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if employee not found
        }
    }
    // Delete an employee by ID
    @Operation(summary =  "Delete employee by ID", description = "Delete an employee by their ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Delete employee"),
            @ApiResponse(responseCode = "404", description = "Employee not found")
    })
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
        Optional<Employee> existingEmployee = employeeService.getemployeebyid(id);
        if (existingEmployee.isPresent()) {
            employeeService.deleteemployee(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 when successfully deleted
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if employee not found
        }
    }
}
