package com.example.th6_3.comon;

import com.example.th6_3.entity.Student;
import com.example.th6_3.dao.SinhVienDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;
@Configuration
public class MyConfiguration {

    @Bean
    public CommandLineRunner getrunner(SinhVienDAO sinhVienDAO){

        return runner ->{
            Scanner scanner = new Scanner(System.in);
            while(true){

                printMenu();
                int choose = scanner.nextInt();
                scanner.nextLine();
                if(choose ==1){
                    //Lấy thông tin sinh viên
                    System.out.println("Nhap ho dem :");
                    String ho_dem= scanner.nextLine();
                    System.out.println("Nhap ten :");
                    String ten = scanner.nextLine();
                    System.out.println("Nhap email");
                    String email= scanner.nextLine();
                    Student student=new Student(ho_dem,ten,email);
                    //luu xuogn coo so du lieu
                    sinhVienDAO.save(student);
                }else if(choose == 2){
                    System.out.println("Nhap id sinh vien muon tim");
                    int id= scanner.nextInt();
                    Student student=sinhVienDAO.getStudentById(id);
                    if(student == null){
                        System.out.println("khong tim thay sinh vien can tim");
                    }else{
                        System.out.println(student.toString());
                    }

                }
            }
        };
    }

    public void printMenu(){
        System.out.println(
                "MENU:\n"+
                        "1. Thêm sinh viên \n"+
                        "2.Tìm sinh viên \n"+
                        "3. Xóa sinh viên \n"+
                        "Lựa chọn "
        );
    }
}

