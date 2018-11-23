package com.amdiatou.springdemo.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdiatou.springdemo.mvc.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	// add an initBinder ... to convert trim input strings
	// remove leading and trailing whitespace
	// resole issue for our validation
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		
		// set to null if only white space
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
		
	@RequestMapping("showForm")
	public String showForm(Model pModel) {
		
		pModel.addAttribute("customer", new Customer());
		
		return "customer/customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		// log 
		System.out.println("FirstName: |"+ theCustomer.getFirstName() +"|");
		System.out.println("LastName: |"+ theCustomer.getLastName() +"|");
		
		if(theBindingResult.hasErrors()) {
			return "customer/customer-form";
		}else {
			return "customer/customer-confirmation";
		}
		
	}
	
	
}
