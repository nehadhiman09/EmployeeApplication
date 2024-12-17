package com.example.Employee_Crud_Application.Service;

import com.example.Employee_Crud_Application.Entity.Department;
import com.example.Employee_Crud_Application.Entity.Employee;
import com.example.Employee_Crud_Application.Repository.DepartmentRepository;
import com.example.Employee_Crud_Application.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Department> getalldepartment()
    {
        return departmentRepository.findAll();
    }

    public Department createorupdate(Department department)
    {
        //save the department first so that id is not valid
        Department savedDepartment = departmentRepository.save(department);

        if (department.getEmployees() != null) {
            for (Employee employee : department.getEmployees()) {
                employee.setDepartment(department); // Set the department for each employee
                employeeRepository.save(employee); // Save the employee to associate them with the department
            }
        }

        return savedDepartment; // Save the department (and associated employees if any)
    }
    }

