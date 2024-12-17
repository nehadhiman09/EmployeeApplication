package com.example.Employee_Crud_Application.Controller;

import com.example.Employee_Crud_Application.Entity.Employee;
import com.example.Employee_Crud_Application.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
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
//    @PostMapping("/emp")
//    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
//        Employee createdEmployee = employeeService.createemployee(employee);
//        return new ResponseEntity<>(createdEmployee, HttpStatus.CREATED);
//    }
//
//    // Get all employees
//    @GetMapping("/allemp")
//    public ResponseEntity<List<Employee>> getEmployees() {
//        List<Employee> employees = employeeService.getallemployees();
//        return new ResponseEntity<>(employees, HttpStatus.OK);
//    }
//
//    // Get employee by ID
//    @GetMapping("/{id}")
//    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
//        Optional<Employee> employee = employeeService.getemployeebyid(id);
//        if (employee.isPresent()) {
//            return new ResponseEntity<>(employee.get(), HttpStatus.OK);
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//        }
//    }
//
//    // Update existing employee
//    @PutMapping("/{id}")
//    public ResponseEntity<Employee> updateEmployee(@PathVariable("id") Long id, @RequestBody Employee employee) {
//        Employee updatedEmployee = employeeService.updateemployee(id, employee);
//        if (updatedEmployee != null) {
//            return new ResponseEntity<>(updatedEmployee, HttpStatus.OK); // Return updated employee with status 200
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if employee not found
//        }
//    }
//
//    // Delete an employee by ID
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
//        Optional<Employee> existingEmployee = employeeService.getemployeebyid(id);
//        if (existingEmployee.isPresent()) {
//            employeeService.deleteemployee(id);
//            return new ResponseEntity<>(HttpStatus.NO_CONTENT); // Return 204 when successfully deleted
//        } else {
//            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Return 404 if employee not found
//        }
//    }
}
