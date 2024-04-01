package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping("/welcome")
@Controller
public class ShowController {
	
	//RequestMapping req path is CaseSensitive
	/* @RequestMapping("/report")
	public String showHome() {
		//return LVN
		return "welcome";
	}
	  @RequestMapping("/REPORT")
	  public String show() {
		  return "home";
		  
	  }*/
	
	/*//one req path can have maltiple RequestPaths
	@RequestMapping({"/report1","/report2","/report3"})
	public String show() {
	  return "home";
	  
	}*/
	
	/*//req path is / then it is default path executes Automatically
	@RequestMapping("/")
	public String show() {
	  return "home";
	  
	}*/
	
	  //req path is not given then it takes / automatically
		/*  @RequestMapping
		  public String show() {
			  System.out.println("ShowController.show()");
			  return "welcome";
			  
		  }*/
	
			/*  //@RequestMapping(value="/report",method=RequestMethod.GET)
			  @GetMapping("/report")
			  public String showReport() {
				  System.out.println("ShowController.showReport()");
				  return "show_report";
			  }*/
			/* //@RequestMapping(value="/report",method=RequestMethod.GET)
			 @GetMapping("/report")
			 public String showReport1() {
			  System.out.println("ShowController.showReport()");
			  return "show_report1";
			 }*/
		  
			/*//@RequestMapping(value="/report",method=RequestMethod.POST)
			  @PostMapping("/report")
			 public String showReport1() {
			 	System.out.println("ShowController.showReport1()");
			 	return "show_report1";
			 }*/
			/*  
			//@RequestMapping(value="/report",method=RequestMethod.GET)
			  @GetMapping
			  public String showReport() {
				  System.out.println("ShowController.showReport()");
				  return "welcome";
			  }
			  
			//@RequestMapping(value="/report",method=RequestMethod.POST)
			  @PostMapping
			 public String showReport1() {
			 	System.out.println("ShowController.showReport1()");
			 	return "welcome";
			 }
			*/
	    
			/* @GetMapping("/all")
			  public String showReport() {
				  System.out.println("ShowController.showReport()");
				  return "show_report";
			  }*/

	 //1st Senario
		/* @GetMapping("/report")
		 public String forward() {
			 System.out.println("ShowController.showReport()");
			 return "forward:all";
		 }*/
	//send Redirect
	 @GetMapping("/all")
			  public String showReport() {
				  System.out.println("ShowController.showReport()");
				  return "show_report";
			  }
	
	//1st Senario
	 @GetMapping("/report")
		 public String forward() {
			 System.out.println("ShowController.forwatd()");
			 return "redirect:all";
		 }
	 
			/* @GetMapping("/report")
			 public String forward() {
				 System.out.println("ShowController.showReport()");
				 return "forward:test/all";
			 }*/
	   
	}
	

