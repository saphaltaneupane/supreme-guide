package com.bway.springproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bway.springproject.model.Employee;
import com.bway.springproject.service.DepartmentService;
import com.bway.springproject.service.EmployeeService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	@Autowired
	private DepartmentService deptService;
	@GetMapping("/employee")
   public String getEmployee(Model model,HttpSession session) {
		if(session.getAttribute("validuser")== null) {
			return "LoginForm";
		}
		model.addAttribute("dList", deptService.getAllDepts());
	   return "EmployeeForm";
   }
	@PostMapping("/employee")
	 public String postEmployee(@ModelAttribute Employee emp) {
		empService.addEmployee(emp);
		 return "redirect:/employee";
	 }
}
