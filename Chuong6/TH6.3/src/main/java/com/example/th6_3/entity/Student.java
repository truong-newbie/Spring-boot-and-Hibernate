package com.example.th6_3.entity;

import jakarta.persistence.*;

@Entity
@Table(name="student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="ten")
    private String ten;

    @Column(name="hodem")
    private String hodem;

    @Column(name="email")
    private String email;

    public Student(){

    }
    public Student(String hodem, String ten, String email){
        this.ten = ten;
        this.hodem = hodem;
        this.email = email;
    }
    public Student(int id, String hodem, String ten, String email){
        this.id = id;
        this.ten = ten;
        this.hodem = hodem;
        this.email = email;
    }
    public String toString(){
        return ten + " " + hodem + " " + email;
    }
}
