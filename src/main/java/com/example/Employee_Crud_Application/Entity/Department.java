package com.example.Employee_Crud_Application.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;


import java.util.List;

@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotEmpty(message = "Department name is required")
    @Column(length = 30)
    private String name;

    // One department can have many employees
    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Employee> employees;

 public Department()
 {

 }
    @Override
    public String toString() {
        return "Department{id=" + id + ", name='" + name + "'}";
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
