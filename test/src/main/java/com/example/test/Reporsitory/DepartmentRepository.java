package com.example.test.Reporsitory;
import com.example.test.Controller.Department;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DepartmentRepository extends JpaRepository<Department, Long> {}
