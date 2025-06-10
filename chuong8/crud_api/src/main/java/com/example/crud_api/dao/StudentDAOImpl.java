package com.example.crud_api.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.crud_api.enity.Student;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {
    private EntityManager entityManager;

    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        String jpql = "SELECT s FROM Student s";

        return entityManager.createQuery(jpql, Student.class).getResultList();
    }

    @Override
    public Student findById(int id) {

        return entityManager.find(Student.class, id); // Find a student by ID
    }

    @Override

    public Student save(Student student) {

        entityManager.persist(student); // Save a new student
        return student; // Return the saved student
    }

    @Override

    public Student saveAndFlush(Student student) {
        student = entityManager.merge(student);
        entityManager.flush();
        return student; // Placeholder return
    }

    @Override
    public void deleteById(int id) {
        Student student = entityManager.find(Student.class, id);
        entityManager.remove(student); // Delete a student by ID
        // Logic to delete a student by ID
    }

}
