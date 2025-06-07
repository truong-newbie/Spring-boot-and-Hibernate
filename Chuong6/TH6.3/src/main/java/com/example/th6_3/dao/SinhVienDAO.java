package com.example.th6_3.dao;

import com.example.th6_3.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface SinhVienDAO {
    public void save(Student student);

    public Student getStudentById(int id);

    public List<Student> getAll();

    public List<Student> getByName(String name);

    public void updateOne(Student student);

    public int updateManyForName();

    public void DeleteOne(int id);

    public int deletemanyForName(String condition);
}
