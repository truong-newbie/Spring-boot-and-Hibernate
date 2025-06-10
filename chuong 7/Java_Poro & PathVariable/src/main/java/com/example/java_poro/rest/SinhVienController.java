package com.example.java_poro.rest;


import com.example.java_poro.Entity.ErrorResponse;
import com.example.java_poro.Entity.SinhVien;
import com.example.java_poro.exception.SinhVienException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        SinhVien result = null;
        for(SinhVien sv: danhsach){
            if(sv.getId()  == id){
                return sv;
            }
        }
        if(result ==null)
            throw new SinhVienException("khong tim thay sinh vien can tim");
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

    @GetMapping("/index/{index}")
    public SinhVien getSinhVien2(@PathVariable int index){
        SinhVien sinhVien =null;
        try{
            sinhVien = danhsach.get(index);
        }catch (IndexOutOfBoundsException e){
            throw new SinhVienException("khong tim thay sinh vien can tim");
        }
        return sinhVien;
    }

//    @ExceptionHandler
//    public ResponseEntity<ErrorResponse> batloi(SinhVienException ex){
//
//        ErrorResponse er = new ErrorResponse(HttpStatus.NOT_FOUND.value(), ex.getMessage());
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
//
//    }
//
//    @ExceptionHandler
//    public ResponseEntity<ErrorResponse> batloi2(Exception ex){
//
//        ErrorResponse er = new ErrorResponse(HttpStatus.BAD_REQUEST.value(), ex.getMessage());
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(er);
//
//    }
}
