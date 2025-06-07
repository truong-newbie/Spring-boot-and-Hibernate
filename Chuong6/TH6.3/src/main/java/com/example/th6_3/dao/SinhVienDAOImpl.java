package com.example.th6_3.dao;

import com.example.th6_3.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class SinhVienDAOImpl implements SinhVienDAO {
    private EntityManager entityManager;


    @Autowired
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        this.entityManager.persist(student);
    }

    @Override
    public Student getStudentById(int id) {
        return this.entityManager.find(Student.class, id);
    }
}
