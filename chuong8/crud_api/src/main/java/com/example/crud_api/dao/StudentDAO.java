package com.example.crud_api.dao;

import java.util.List;

import org.hibernate.annotations.Comment;
import org.springframework.stereotype.Component;

import com.example.crud_api.enity.Student;

@Component
public interface StudentDAO {
    public List<Student> findAll();

    // read
    public Student findById(int id);

    // create
    public Student save(Student student);

    // update
    public Student saveAndFlush(Student student);

    // delete
    public void deleteById(int id);
}
