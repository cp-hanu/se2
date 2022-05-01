package com.example.ss2.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String address;
    private String logo;
}
