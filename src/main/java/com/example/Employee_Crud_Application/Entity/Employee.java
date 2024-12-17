package com.example.Employee_Crud_Application.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "First name is mandtory")
    private String first_name;

    @NotBlank(message = "Last name is mandtory")
    private String last_name;

    @Column(unique = true)
    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is mandtory")
    private String email;

    @NotBlank(message = "Password is mandtory")
    private String password;

    @ManyToOne
    @JoinColumn(name= "department_id")
    private Department department;

    public Employee() {
    }

    public Employee(long id, String first_name, String last_name, String email, String password, Department department) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.department = department;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", department=" + department +
                '}';
    }
}
