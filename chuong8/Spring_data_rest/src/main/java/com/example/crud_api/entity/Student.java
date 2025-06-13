package com.example.crud_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "student ")
public class Student {
    // field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "last_name", length = 45)
    private String lastName;

    @Column(name = "first_name", length = 45)
    private String firstName;

    @Column(name = "email", length = 45)
    private String email;
    // constructor

    public Student() {
    }

    public Student(String lastName, String firstName, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    public Student(int id, String lastName, String firstName, String email) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
    }

    // getter and setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
