package com.example.th6_3.dao;

import com.example.th6_3.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

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

    @Override
    public List<Student> getAll() {
        String jpql = "SELECT s FROM Student s";
        List<Student> students= this.entityManager.createQuery(jpql, Student.class).getResultList();
        return students;
    }

    @Override
    public List<Student> getByName(String ten) {
        String jpql="SELECT s FROM Student s WHERE s.ten=:t";
       //TypedQuery<Student> students = this.entityManager.createQuery(jpql, Student.class).setParameter("t",ten).getResultList();
        TypedQuery<Student> students = this.entityManager.createQuery(jpql, Student.class).setParameter("t",ten);
        return students.getResultList();
    }

    @Override
    public void updateOne(Student student) {
        this.entityManager.merge(student);
    }

    @Override
    public int updateManyForName() {
        String jpql= "UPDATE Student s SET s.ten=:t WHERE s.ten=:m";

        Query query = this.entityManager.createQuery(jpql);
        query.setParameter("t","truong");
        query.setParameter("m","do dang");
        return query.executeUpdate();

    }

    @Override
    public void DeleteOne(int id) {
        Student student= this.entityManager.find(Student.class, id);
        if(student == null){
            System.out.println("khong tim thay sinh vien can xoa");
        }else {
            this.entityManager.remove(student);  //  ham remove
            System.out.println("xoa thanh cong");
        }

    }


    @Override
    public int deletemanyForName(String condition) {
        String jpql="DELETE FROM Student s Where "+ condition;
        Query query= this.entityManager.createQuery(jpql);
        return query.executeUpdate();

    }
}
