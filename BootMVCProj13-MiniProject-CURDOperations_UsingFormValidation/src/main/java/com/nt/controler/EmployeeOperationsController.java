package com.nt.controler;

import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.model.Employee;
import com.nt.service.IEmployeeMgmtService;
import com.nt.validator.EmployeeValidator;
@Controller
public class EmployeeOperationsController {
	
	@Autowired
   private IEmployeeMgmtService empService;
	@Autowired
	private EmployeeValidator empValidator;
	
	@GetMapping("/")
	public String showHome() {
		return "home";
	}
	
	@GetMapping("/report")
	public String showEmployeeReport(Map<String,Object>map) {
		//use service
		Iterable<Employee> itEmps=empService.getAllEmployees();
		//put result in model attribute
		map.put("empList", itEmps);
		//return Lvn
		return "show_employee_report";
		}
	
	@GetMapping("/add")
	public String showFormSaveEmployee(@ModelAttribute("emp")Employee emp) {
		//return LVN
		return "register_employee";
		}
	//In this Method We have a Double Posting Problem
		/*@PostMapping("/add")
		public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map) {
			//use Service
			String msg=empService.registerEmployee(emp);
			Iterable<Employee> itEmps=empService.getAllEmployees();
			//keep the result in ModelAttributes
			map.put("resultMsg",msg);
			map.put("empList", itEmps);
			//return LVN
			return "show_employee_report";
		}*/
	//To Solve the Above The Problem  
	/*@PostMapping("/add")
	public String saveEmployee(@ModelAttribute("emp")Employee emp,Map<String,Object>map) {
		//use Service
		String msg=empService.registerEmployee(emp);
		//Iterable<Employee> itEmps=empService.getAllEmployees();
		//keep the result in ModelAttributes
		map.put("resultMsg",msg);
		//map.put("empList", itEmps);
		//return LVN
		return "redirect:report";
	}*/
	
	@PostMapping("/add")
	public String saveEmployee(@ModelAttribute("emp")Employee emp,RedirectAttributes attrs,
			                                                         BindingResult errors){
		System.out.println("EmployeeOperationsController.saveEmployee()");
		//use valudator
		if(empValidator.supports(Employee.class)) {
			empValidator.validate(emp, errors);
			
			if(errors.hasErrors())
				return "register_employee";
		}
		//use Service
		String msg=empService.registerEmployee(emp);
		//Iterable<Employee> itEmps=empService.getAllEmployees();
		//keep the result in ModelAttributes
		attrs.addFlashAttribute("resultMsg",msg);
		//map.put("empList", itEmps);
		//return LVN
		return "redirect:report";
	}
	
	/*@PostMapping("/add")
	public String saveEmployee(@ModelAttribute("emp")Employee emp,HttpSession attrs){
		//use Service
		String msg=empService.registerEmployee(emp);
		//Iterable<Employee> itEmps=empService.getAllEmployees();
		//keep the result in ModelAttributes
		attrs.setAttribute("resultMsg",msg);
		//map.put("empList", itEmps);
		//return LVN
		return "redirect:report";
	}*/
	
	@GetMapping("/edit")
	public String showEditEmployeeFormPage(@RequestParam("no")int no,@ModelAttribute("emp")Employee emp) {
		//use Service
		Employee emp1=empService.getEmployeeByNo(no);
		//copy data to model Attribute
		BeanUtils.copyProperties(emp1, emp);
		//return Lvn
		return "update_employee";
		}
	@PostMapping("/edit")
	public String editEmployee(RedirectAttributes attrs,@ModelAttribute("emp")Employee emp,BindingResult errors) {
		if(empValidator.supports(Employee.class)) {
			empValidator.validate(emp, errors);
			
			if(errors.hasErrors())
				return "update_employee";
		}
		String msg=empService.updateEmployee(emp);
		//add the result to the Flash Attributes
		attrs.addFlashAttribute("resultMsg",msg);
		//redirect the redirect
		return "redirect:report";
	}
	
	@GetMapping("/delete")
	public String deleteEmployee(RedirectAttributes attrs,@RequestParam int no) {
		String msg=empService.deleteEmployee(no);
		//keep the result in Flash Attributes
		attrs.addFlashAttribute("resultMsg",msg);
		return "redirect:report";
	}
	

}
