package com.example.java_poro.rest;


import com.example.java_poro.Entity.SinhVien;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/sinhvien")
public class SinhVienController {

    public List<SinhVien> danhsach;

    @PostConstruct
    public void createDanhSach(){
        danhsach = new ArrayList<SinhVien>();
        danhsach.add(new SinhVien("Do Dang A",1,20,"Java",10));
        danhsach.add(new SinhVien("Do Dang B ",2,21,"C",9));
        danhsach.add(new SinhVien("Do Dang C ",3,22,"C#",8));
        danhsach.add(new SinhVien("Do Dang D ",4,23,"C++",7));
        danhsach.add(new SinhVien("Do Dang E ",5,24,"JavaScrips",5));

    }

    @GetMapping("/")
    public List<SinhVien> getDanhSach(){
        return danhsach;
    }

    @GetMapping("/{id}")
    public SinhVien getSinhVien(@PathVariable int id){
        for(SinhVien sv: danhsach){
            if(sv.getId()  == id){
                return sv;
            }
        }
        return null;

    }

    @GetMapping("/{id}/{tuoi}")
    public SinhVien getSinhVien1(@PathVariable int id, @PathVariable("tuoi") int age){   // chi dinh ten bien
        for(SinhVien sv: danhsach){
            if(sv.getId()  == id && sv.getTuoi() == age){
                return sv;
            }
        }
        return null;
    }

}
