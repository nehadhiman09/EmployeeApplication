package com.example.Employee_Crud_Application.Repository;

import com.example.Employee_Crud_Application.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //Optional<Employee> findByEmail(String email);
    boolean existsByEmail(String email);
    // Optional: Add other query methods as needed
    // Example: Optional<Employee> findByFirstname(String firstname);
    // Example: Optional<Employee> findByLastname(String lastname);

}
