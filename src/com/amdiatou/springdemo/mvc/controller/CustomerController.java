package com.amdiatou.springdemo.mvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.amdiatou.springdemo.mvc.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	
	@RequestMapping("showForm")
	public String showForm(Model pModel) {
		
		pModel.addAttribute("customer", new Customer());
		
		return "customer/customer-form";
	}
	
	@RequestMapping("processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		if(theBindingResult.hasErrors()) {
			return "customer/customer-form";
		}else {
			return "customer/customer-confirmation";
		}
		
	}
	
	
}
