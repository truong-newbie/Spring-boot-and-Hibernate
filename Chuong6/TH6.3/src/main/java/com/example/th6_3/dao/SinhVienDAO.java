package com.example.th6_3.dao;

import com.example.th6_3.entity.Student;
import org.springframework.stereotype.Repository;


public interface SinhVienDAO {
    public void save(Student student);

    public Student getStudentById(int id);
}
