package com.example.java_poro.Entity;

public class Student {
    private int id;

    private String hoVaTen;

    private int tuoi;

    private String nganhHoc;

    private double diemTB;

    public Student(String hoVaTen, int id, int tuoi, String nganhHoc, double diemTB) {
        this.hoVaTen = hoVaTen;
        this.id = id;
        this.tuoi = tuoi;
        this.nganhHoc = nganhHoc;
        this.diemTB = diemTB;
    }

    public Student() {
    }
}
