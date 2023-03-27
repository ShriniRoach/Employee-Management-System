package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
}
