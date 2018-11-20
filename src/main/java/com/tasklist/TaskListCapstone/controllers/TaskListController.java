package com.tasklist.TaskListCapstone.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.tasklist.TaskListCapstone.entity.Employee;
import com.tasklist.TaskListCapstone.repo.EmployeeRepository;
import com.tasklist.TaskListCapstone.repo.TaskRepository;


@Controller
public class TaskListController {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Autowired
	TaskRepository taskRepo;
	
	@RequestMapping("/")
	public ModelAndView  index() {
		String welcomeMsg = "Welcome to the Productivity Tracker!";
		return new ModelAndView("index", "homepage", welcomeMsg);
	}
	
	
	
	@PostMapping("/registeremp")
	public ModelAndView addNewEmployee(@RequestParam("empname") String empname, 
			@RequestParam("emprole") String emprole, @RequestParam("empemail") String empemail, @RequestParam("emppw") String emppw) {
		Employee employee = new Employee(empname, emprole, empemail, emppw);
		empRepo.save(employee);
		String confirm = "Congratulations! You are now a registered employee. Your new employee number is " + employee.getEmpid();
		return new ModelAndView("regConf", "confirmation", confirm);
	}
	
	@RequestMapping("/registration")
	public ModelAndView  registration() {
		String welcomeMsg = "Welcome! Please complete the form";
		return new ModelAndView("registration", "registerEmp", welcomeMsg);
	}
	
	
	@RequestMapping("/showtasks")
	public ModelAndView  showtasks(Employee employee, RedirectAttributes redirectAttrs) {
//		if (empRepo.findByEmpname(employee.getEmpname()) != null) {
//			if (empRepo.findByEmpname(employee.getEmpname()).getEmppw().equals(employee.getEmppw())) {
//				Employee test = empRepo.findByEmpname(employee.getEmpname());
//				System.out.println(taskRepo.findByEmpid(test.getEmpid()));
//				System.out.println(test);
//			}
//		}
		System.out.println(employee);
//		Employee test = empRepo.findByEmpname(employee.getEmpname());
//		System.out.println(test.getEmpid());
//		System.out.println(test);
		String yourTasks = "Welcome! Below are your tasks ";
		return new ModelAndView("showtaskspage", "showtasklist", yourTasks);
	
	//this is the method to use for logging in
//	@RequestMapping("/login-request")
//	public ModelAndView loginRequest(User user, RedirectAttributes redirectAttrs) {
//		ModelAndView mv = new ModelAndView("login-confimed");
//		if (u.findByUsername(user.getUsername()) != null) {
//			if (u.findByUsername(user.getUsername()).getPassword().equals(user.getPassword())) {
//				return mv;
//			}
//			
//		}
//		
//		redirectAttrs.addFlashAttribute("message", "Invalid Credentials");
//
//		mv = new ModelAndView("redirect:/");
//		return mv;
//	}
	

}}
