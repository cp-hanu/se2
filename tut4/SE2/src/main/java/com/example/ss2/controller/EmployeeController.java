package com.example.ss2.controller;


import com.example.ss2.model.Employee;
import com.example.ss2.employee.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/errors")
    public String errorPage(){
        return "error";
    }
    @GetMapping(value = "/create")
    public String createNewEmployee(Model model) {
        model.addAttribute("employee", new Employee());
        return "employeeCreate";
    }

    @PostMapping("/create")
    public String createNewEmployee(@ModelAttribute Employee employee) {

        System.out.println(employee);

        return Optional.ofNullable(employeeService.addEmployee(employee))
                .map(t -> "redirect:/")
                .orElse("error");
    }

    @GetMapping(value = "/list")
    public String getAllEmployee(Model model) {
        var employees = employeeService.findAll();
        System.out.println("Hello");
        System.out.println(employees);
        model.addAttribute("employees", employees);

        return "employeeList";
    }

    @GetMapping(value = "/{id}")
    public String getEmployeeDetail(
            @PathVariable(value = "id") Long id, Model model
    ) {
        var e = employeeService.findById(id);
        model.addAttribute("employee", e);
        return "employeeDetail";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
        Employee employee = employeeService.findById(id);

        model.addAttribute("employee", employee);
        return "employeeUpdate";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") long id, @ModelAttribute @Valid Employee employee, BindingResult result) {
//        if (result.hasErrors()){
//
//        }
        employee.setId(id);
        return Optional.ofNullable(employeeService.saveEmployee(employee))
                .map(t -> "redirect:/")
                .orElse("error");
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        employeeService.deleteEmployeeById(id);
        return "redirect:/";
    }
}
