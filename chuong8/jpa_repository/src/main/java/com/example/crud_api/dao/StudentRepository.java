package com.example.crud_api.dao;

import com.example.crud_api.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    //them cac phuong thuc khac
}
