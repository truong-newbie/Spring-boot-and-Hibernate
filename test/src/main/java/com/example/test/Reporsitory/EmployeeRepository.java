package com.example.test.Reporsitory;
import com.example.test.Controller.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
