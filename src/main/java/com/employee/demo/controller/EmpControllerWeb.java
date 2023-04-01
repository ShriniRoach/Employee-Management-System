package com.employee.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.employee.demo.entity.Employee;
import com.employee.demo.entity.User;
import com.employee.demo.repository.EmployeeRepo;
import com.employee.demo.repository.UserRepo;
import com.employee.demo.service.EmployeeService;

@Controller
public class EmpControllerWeb {
	@Autowired
	EmployeeService service;
	@Autowired
	UserRepo uRepo;
	int id;
	
	@RequestMapping("emp")
	String employee(Model model) {
		List<Employee> elist=service.getAllEmployee();
		model.addAttribute("list", elist);
		return "employee.jsp";
	}
	
	@RequestMapping("addemp")
	String addEmp(Employee emp) {
		eRepo.save(emp);
		return "redirect:/emp";
	}
	
	@RequestMapping("getemp")
	String getEmp(int eid,Model model) {
		Employee emp=service.getEmployee(eid);
		if(emp==null) {
			model.addAttribute("notfound","Employee not found");
		}
		else {
			model.addAttribute("notfound","");
			model.addAttribute("eid", emp.getEid());
			model.addAttribute("name", emp.getName());
			model.addAttribute("mobile", emp.getMobile());
			model.addAttribute("email", emp.getEmailID());
			model.addAttribute("job", emp.getJob());
			model.addAttribute("gender", emp.getGender());
			model.addAttribute("address", emp.getAddress());
			model.addAttribute("salary", emp.getSalary());
		}
		return "emp";
	}
	
	@RequestMapping("edits")
	String update(int eid,Model model) {
		id=eid;
		Employee employee=service.getEmployee(eid);
		model.addAttribute("ename", employee.getName());
		model.addAttribute("emobile", employee.getMobile());
		model.addAttribute("eemail", employee.getEmailID());
		
		model.addAttribute("ejob", employee.getJob());
		if(employee.getJob().equals("Java Developer")) {
			model.addAttribute("ejob2","SQL Developer");
			model.addAttribute("ejob3","Web Developer");
			model.addAttribute("ejob4","Python Developer");
		}
		else if(employee.getJob().equals("SQL Developer")) {
			model.addAttribute("ejob2","Java Developer");
			model.addAttribute("ejob3","Web Developer");
			model.addAttribute("ejob4","Python Developer");
		}
		else if(employee.getJob().equals("Web Developer")) {
			model.addAttribute("ejob2","Java Developer");
			model.addAttribute("ejob3","SQL Developer");
			model.addAttribute("ejob4","Python Developer");
		}
		else {
			model.addAttribute("ejob2","Java Developer");
			model.addAttribute("ejob3","SQL Developer");
			model.addAttribute("ejob4","Web Developer");
		}
		
		model.addAttribute("egender", employee.getGender());
		if(employee.getGender().equals("Male"))
			model.addAttribute("egender2","Female");
		else
			model.addAttribute("egender2","Male");
		
		model.addAttribute("eaddress", employee.getAddress());
		model.addAttribute("esalary", employee.getSalary());
		
		return "updateemp.jsp";
	}
	
	@RequestMapping("update")
	String updateEmp(Employee emp,Model model) {
		service.updateEmployee(id,emp);
		return "redirect:/emp";
	}
	
	@RequestMapping("deleteemp")
	String delEmp(int eid) {
		service.deleteEmployee(eid);
		return "redirect:/emp";
	}
	
	@RequestMapping("home")
	String home() {
		return "user.jsp";
	}
	
	@RequestMapping("user")
	String user(User user,Model model) {
		List<User> ulist=uRepo.findAll();
		for(User u:ulist) {
			if(user.getUsername().equals(u.getUsername())) {
				if(user.getPassword().equals(u.getPassword())) { 
					return "emp";
				}
				else {
					model.addAttribute("pwd", "Invalid password");
					return "user.jsp";
				}
			}
			else
				model.addAttribute("name", "Invalid username");
		}
		return "user.jsp";
	}
}
