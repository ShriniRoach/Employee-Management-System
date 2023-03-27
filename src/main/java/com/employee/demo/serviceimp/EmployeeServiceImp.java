package com.employee.demo.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.demo.entity.Employee;
import com.employee.demo.entity.User;
import com.employee.demo.repository.EmployeeRepo;
import com.employee.demo.repository.UserRepo;
import com.employee.demo.service.EmployeeService;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo eRepo;
	@Autowired
	private UserRepo uRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return eRepo.save(employee);
	}

	@Override
	public Employee updateEmployee(int eid,Employee employee) {
		Employee emp=eRepo.findById(eid).orElse(null);
		emp.setName(employee.getName());
		emp.setMobile(employee.getMobile());
		emp.setEmailID(employee.getEmailID());
		emp.setJob(employee.getJob());
		emp.setGender(employee.getGender());
		emp.setAddress(employee.getAddress());
		emp.setSalary(employee.getSalary());
		return eRepo.save(emp);
	}

	@Override
	public void deleteEmployee(int eid) {
		eRepo.deleteById(eid);
	}

	@Override
	public Employee getEmployee(int eid) {
		return eRepo.findById(eid).orElse(null);
	}

	@Override
	public List<Employee> getAllEmployee() {		
		return eRepo.findAll();
	}
  
}
