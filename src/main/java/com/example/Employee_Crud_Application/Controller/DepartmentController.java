package com.example.Employee_Crud_Application.Controller;


import com.example.Employee_Crud_Application.Entity.Department;
import com.example.Employee_Crud_Application.Service.DepartmentService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @Operation(summary = "Get all department", description = "Fetch all department from the database")
    @GetMapping
    public List<Department> getAllDepartments() {
        return departmentService.getalldepartment();
    }


    @Operation(summary = "Create a new department", description = "Create a new department record")
    // Create or update a department
    @PostMapping("/create")
    public Department createOrUpdateDepartment(@RequestBody Department department) {

        return departmentService.createorupdate(department);
    }
}
