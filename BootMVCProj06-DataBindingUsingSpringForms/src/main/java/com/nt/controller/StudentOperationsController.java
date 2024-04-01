package com.nt.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.nt.model.Student;

@Controller
public class StudentOperationsController {
	@GetMapping("/")
	public String showHomePage() {
		//return LVN (home page---welcome.jsp)
		return "welcome";
	   }
	@GetMapping("/register")
	public String showStudentFormPage(Map<String,Object>map,@ModelAttribute("stud")Student st) {
		System.out.println("StudentOperationsController.showStudentFormPage()");
		System.out.println("Model class Object data::"+st);
		//return Lvn
		return "student_register";	
	 }
	 @PostMapping("/register")
	public String showResult(Map<String,Object>map,@ModelAttribute("stud")Student st) {
		 System.out.println("StudentOperationsController.showResult()");
		 System.out.println(st);
		 String result=null;
		 if(st.getAvg()>=35)
			 result="Pass"; 
	 else
		 result="Fail";
		map.put("result", result);
		return "show_result";
	}

}
