package com.amdiatou.springdemo.mvc;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	// @Value("#{countryOptions}")  
	// private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model pModel) {
		
		// create a new Student object
		Student vStudent = new Student();
		
		// add student to the model
		pModel.addAttribute("student", vStudent);
		
		// add the country options to the model 
	    // pModel.addAttribute("theCountryOptions", countryOptions); 
	    
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student pStudent) {
		
		// log the input data
		System.out.println("First Name: " + pStudent.getFirstName());
		System.out.println("Last Name: " + pStudent.getLastName());
		System.out.println("Country: " + pStudent.getCountry());
		System.out.println("Favorite Language: " + pStudent.getFavoriteLanguage());
		
		return "student-confirmation";
	}
}
