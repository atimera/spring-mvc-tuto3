package com.amdiatou.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model pModel) {
		
		// create a new Student object
		Student vStudent = new Student();
		
		// add student to the model
		pModel.addAttribute("student", vStudent);
		// 
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student pStudent) {
		
		// log the input data
		System.out.println("First Name: " + pStudent.getFirstName());
		System.out.println("Last Name: " + pStudent.getLastName());
		
		return "student-confirmation";
	}
}
