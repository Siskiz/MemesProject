package com.example.memes.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "description")
    private String description;
    @Column(name = "age")
    private int age;

    public User() {

    }

    public User(String name, String surname, String description, int age) {
        this.name = name;
        this.surname = surname;
        this.description = description;
        this.age = age;
    }
}
