package com.example.ss2;

import com.example.ss2.employee.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
//    @Autowired
//    JdbcTemplate jdbcTemplate;


    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);


//        EmployeeService employeeService = context.getBean(EmployeeService.class);
//        System.out.println(employeeService.findAll());
//        System.out.println(employeeService.findById(1L));
    }

}
