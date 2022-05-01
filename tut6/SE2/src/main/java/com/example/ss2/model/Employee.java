package com.example.ss2.model;

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

    //    @Length(min = 3, max = 60)
    private String name;
    //    @Min(18)
//    @Max(55)
    private int age;

    //    @NotEmpty(message = "Image cannot left blank")
    private String imageUrl;

    //    @NotEmpty(message = "Address cannot left blank")
    private String address;
//
//    @ManyToOne
//    private Company company;


    public Employee() {

    }

    public Employee(String name, int age, String imageUrl, String address) {
        this.name = name;
        this.age = age;
        this.imageUrl = imageUrl;
        this.address = address;
    }
}
