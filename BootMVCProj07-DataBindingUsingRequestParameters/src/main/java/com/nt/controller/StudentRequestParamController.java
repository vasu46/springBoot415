package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentRequestParamController {
	/* @GetMapping("/data")
	public String process(@RequestParam("sno")int no,@RequestParam("sname")String name){
	  System.out.println(no+" "+name);
	  //return Lvn
	  return "show_result";
	}*/
	
	/*  @GetMapping("/data")
	  public String process(@RequestParam int sno,@RequestParam String sname){
	   System.out.println(sno+" "+sname);
	   //return Lvn
	   return "show_result";
	  }*/
	
	/* @GetMapping("/data")
	 public String process(@RequestParam int sno,@RequestParam String name){
	   System.out.println(sno+" "+name);
	   //return Lvn
	   return "show_result";
	 }*/
	
	/*@GetMapping("/data")
	public String process(@RequestParam int sno,@RequestParam(required=false) String sname){
	   System.out.println(sno+" "+sname);
	   //return Lvn
	   return "show_result";
	}*/
	
	   @GetMapping("/data")
	   public String process(@RequestParam int sno,@RequestParam(defaultValue="rrr") String sname){
		   System.out.println(sno+" "+sname);
		   //return Lvn
		   return "show_result";
	   }

}
