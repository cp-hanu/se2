package com.example.ss2.employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAllById(Long id);

    Employee findEmployeeById(Long id);
}
