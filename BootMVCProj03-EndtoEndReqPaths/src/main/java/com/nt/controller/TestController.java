package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RequestMapping("/test")
@Controller
public class TestController {
	    
	  @GetMapping("/all")
	 public String showReport1() {
	 System.out.println("ShowController.showReport1()");
	return "show_report1";
			 }
	         
			
	
	   
	}
	

