package com.example.th6_3.comon;

import com.example.th6_3.entity.Student;
import com.example.th6_3.dao.SinhVienDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
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

                }else if(choose == 3){
                    System.out.println("Danh sach sinh vien :");
                    List<Student> student =sinhVienDAO.getAll();
                    for(Student s:student){
                        System.out.println(s.toString()+"\n");
                    }
                }else if(choose ==4){
                    System.out.println("Moi nhap ten sinh vien muon tim");
                    String ten= scanner.nextLine();
                    List<Student> student= sinhVienDAO.getByName(ten);
                    if(student.size() == 0){
                        System.out.println("khong tim thay sinh vien can tim");

                    }else{
                        for(Student s:student){
                            System.out.println(s.toString()+"\n");
                        }
                    }
                }else if(choose ==5){
                    System.out.println("Nhap id sinh vien muon cap nhat");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Nhap ten");
                    String ten=scanner.nextLine();
                    System.out.println("Nhap hodem");
                    String hodem= scanner.nextLine();
                    System.out.println("Nhap email");
                    String email= scanner.nextLine();
                    Student student = new Student( id, hodem,ten,email);
                    sinhVienDAO.updateOne(student);

                }else if(choose ==6){
                    int check =sinhVienDAO.updateManyForName();
                    if(check ==0){
                        System.out.println("khong co nguoi can cap nhat");
                    }else{
                        System.out.println("cap nhat thanh cong");
                    }
                }else if(choose ==7){
                    System.out.println("Nhap id sinh vien muon xoa");
                    int id = scanner.nextInt();
                    sinhVienDAO.DeleteOne(id);
                }else if(choose ==8){
                    System.out.println("Nhap dieu kien muon xoa");
                    String condition = scanner.nextLine();
                    int check = sinhVienDAO.deletemanyForName(condition);
                    if(check ==0){
                        System.out.println("khong co nguoi can xoa");
                    }else{
                        System.out.println("xoa thanh cong");
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
                        "3. In ra tat ca sinh vien \n"+
                        "4. Tim kiem sinh vien theo ten \n"+
                        "5. Cap nhat thong tin 1 sinh vien \n"+
                        "6. Cap nhat thong tin nhieu sinh vien \n"+
                        "7. Xoa thong tin 1 sinh vien \n"+
                        "8.Xoa thong tin nhieu sinh vien \n"+
                        "Lựa chọn "
        );
    }
}

