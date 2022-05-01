package com.example.ss2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class Application {
//    @Autowired
//    JdbcTemplate jdbcTemplate;


    public static void main(String[] args) {
        var context = SpringApplication.run(Application.class, args);

    }

}
