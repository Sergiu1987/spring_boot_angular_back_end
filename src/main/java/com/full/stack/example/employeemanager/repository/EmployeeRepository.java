package com.full.stack.example.employeemanager.repository;

import com.full.stack.example.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    void deleteById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
