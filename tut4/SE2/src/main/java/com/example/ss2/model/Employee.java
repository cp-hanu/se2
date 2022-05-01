package com.example.ss2.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
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


    public Employee() {

    }

    public Employee(String name, int age, String imageUrl, String address) {
        this.name = name;
        this.age = age;
        this.imageUrl = imageUrl;
        this.address = address;
    }
}
