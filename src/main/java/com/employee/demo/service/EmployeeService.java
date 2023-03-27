package com.employee.demo.service;

import java.util.List;

import com.employee.demo.entity.Employee;
import com.employee.demo.entity.User;

public interface EmployeeService {
    Employee addEmployee(Employee employee);
    Employee updateEmployee(int eid,Employee employee);
    void deleteEmployee(int eid);
    Employee getEmployee(int eid);
    List<Employee> getAllEmployee();
    User verifyUser(User user);
}
