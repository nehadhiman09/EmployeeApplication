package com.example.Employee_Crud_Application.Controller;


import com.example.Employee_Crud_Application.Entity.Department;
import com.example.Employee_Crud_Application.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getalldepartment();
    }

    // Create or update a department
    @PostMapping
    public Department createOrUpdateDepartment(@RequestBody Department department) {
        return departmentService.createorupdate(department);
    }
}
