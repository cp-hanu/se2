package com.example.jspserverlet.entity;


import lombok.Data;

@Data
public class User {
    protected int id;
    protected String name;
    protected String email;
    protected String country;
    public User(String name, String email, String country) {
        super();
        this.name = name;
        this.email = email;
        this.country = country;
    }

    public User(int id, String name, String email, String country) {
        super();
        this.id = id;
        this.name = name;
        this.email = email;
        this.country = country;
    }

}
