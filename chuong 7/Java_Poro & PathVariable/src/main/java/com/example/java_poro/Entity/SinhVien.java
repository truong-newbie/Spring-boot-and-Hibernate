package com.example.java_poro.Entity;

public class SinhVien {
    private int id;

    private String hoVaTen;

    private int tuoi;

    private String nganhHoc;

    private double diemTB;

    public SinhVien(String hoVaTen, int id, int tuoi, String nganhHoc, double diemTB) {
        this.hoVaTen = hoVaTen;
        this.id = id;
        this.tuoi = tuoi;
        this.nganhHoc = nganhHoc;
        this.diemTB = diemTB;
    }

    public SinhVien() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(double diemTB) {
        this.diemTB = diemTB;
    }
}
