package com.example.Employee_Crud_Application.Service;

import com.example.Employee_Crud_Application.Entity.Department;
import com.example.Employee_Crud_Application.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getalldepartment()
    {
        return departmentRepository.findAll();
    }

    public Department createorupdate(Department department)
    {
        return departmentRepository.save(department);
    }
}
