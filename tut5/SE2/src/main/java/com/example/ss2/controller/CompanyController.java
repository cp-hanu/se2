package com.example.ss2.controller;

import com.example.ss2.model.Company;
import com.example.ss2.model.Employee;
import com.example.ss2.repository.CompanyRepository;
import com.example.ss2.repository.EmployeeRepository;
import org.aspectj.weaver.ast.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@Controller
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    CompanyRepository companyRepository;


    @GetMapping(value = "/create")
    public String createNewEmployee(Model model) {
        model.addAttribute("company", new Company());
        return "companyCreate";
    }

    @PostMapping("/create")
    public String createNewEmployee(@ModelAttribute Company company) {


        return Optional.ofNullable(companyRepository.save(company))
                .map(t -> "redirect:/")
                .orElse("error");
    }

    @GetMapping(value = "/list")
    public String getAllEmployee(Model model) {
        var employees = employeeRepository.findAll(Sort.by(Sort.Order.asc("name")));
        var company = companyRepository.findAll();
        model.addAttribute("employees", employees);
        model.addAttribute("companies", company);

        return "companyList";
    }

    @GetMapping(value = "/{id}")
    public String getCompanyDetail(
            @PathVariable(value = "id") Long id, Model model
    ) {
//        var e = employeeRepository.findById(id);
        var c = companyRepository.findById(id);
        model.addAttribute("company", c);
        return "companyDetail";
    }

    @GetMapping("/update/{id}")
    public String showUpdateForm(@PathVariable("id") long id, Model model) {
//        Employee employee = employeeRepository.findById(id);
        Optional<Company> company = companyRepository.findById(id);
        model.addAttribute("company", company);
        return "companyUpdate";
    }

    @PostMapping("/update/{id}")
    public String updateEmployee(@PathVariable("id") long id, @ModelAttribute @Valid Company company, BindingResult result) {
//        if (result.hasErrors()){
//
//        }
        company.setId(id);
        return Optional.ofNullable(companyRepository.save(company))
                .map(t -> "redirect:/")
                .orElse("error");
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable("id") long id, Model model) {
        companyRepository.deleteEmployeeById(id);
        return "redirect:/";
    }
}
