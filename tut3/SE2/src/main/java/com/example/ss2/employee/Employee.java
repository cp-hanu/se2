package com.example.ss2.employee;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
public class Employee implements Serializable {
    private static final long serialVersionUID = -297553281792804396L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private int age;
    private String imageUrl;
    private String address;


    public Employee() {

    }

    public Employee(String name, int age, String imageUrl, String address) {
        this.name = name;
        this.age = age;
        this.imageUrl = imageUrl;
        this.address = address;
    }
}
