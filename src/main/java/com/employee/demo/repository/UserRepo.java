package com.employee.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.demo.entity.Employee;
import com.employee.demo.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{
}
