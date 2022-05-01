package com.example.ss2.controller;

import com.example.ss2.model.Employee;
import com.example.ss2.repository.EmployeeRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value = "api")
public class RestController {
    private final ObjectMapper mapper = new ObjectMapper();
    @Autowired
    EmployeeRepository employeeRepository;


    @GetMapping("/list")
    public List<Employee> getAllUser() {
        var x = employeeRepository.findAll();
        return x;
    }

    @GetMapping("/list/{id}")
    public String getUser(@PathVariable Integer id) throws JsonProcessingException {
        var employee = employeeRepository.findEmployeeById(Long.valueOf(id));
        if (employee == null) {
            return mapper.writeValueAsString(new ErrorResponse(HttpStatus.NOT_FOUND, "Employee Not found"));
        }
        return mapper.writeValueAsString(employee);
    }

    @PostMapping("/create")
    public Employee createNewEmployee(@RequestBody Employee employee) {
        System.out.println(employee);
        employeeRepository.save(employee);
        return employee;
    }

    @PutMapping("/update/{id}")
    public Employee updateEmployee(@RequestBody Employee newEmployee, @PathVariable Long id)  {
        return employeeRepository.findById(id)
                .map(employee -> {
                    employee.setName(newEmployee.getName());
                    return employeeRepository.save(employee);
                })
                .orElseGet(() -> {
                    newEmployee.setId(id);
                    return employeeRepository.save(newEmployee);
                });
    }

    @DeleteMapping("/delete/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }

}

@Data
@AllArgsConstructor
class ErrorResponse {
    private HttpStatus statusCode;
    private String msg;
}

