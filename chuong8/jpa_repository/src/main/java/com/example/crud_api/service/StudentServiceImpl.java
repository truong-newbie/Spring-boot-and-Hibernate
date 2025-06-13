package com.example.crud_api.service;

import com.example.crud_api.dao.StudentRepository;
import com.example.crud_api.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
import com.example.crud_api.dao.StudentRepository;
import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        //return studentRepository.findById(id);
        return studentRepository.getReferenceById(id);
    }

    @Override
    @Transactional
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        return studentRepository.saveAndFlush(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }
}
