package com.example.ss2.repository;

import com.example.ss2.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    Employee findEmployeeById(Long id);
}
