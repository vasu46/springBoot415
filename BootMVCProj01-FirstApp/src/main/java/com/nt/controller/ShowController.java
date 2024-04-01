package com.nt.controller;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ShowController {
	
	/* @RequestMapping("/home")
	public String showHome() {
		//return LVN
		return "welcome";
	}*/
	
	/*@RequestMapping("/")
	public String showHome() {
	 //return LVN
	 return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public String process(Map<String,Object> map) {
		map.put("age","val1");
		map.put("sysdate",LocalDateTime.now());
		return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public String process(Model model) {
		model.addAttribute("age","val1");
		model.addAttribute("sysdate",LocalDateTime.now());
		return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public String process(ModelMap model) {
		model.addAttribute("age","val1");
		model.addAttribute("sysdate",LocalDateTime.now());
		return "welcome";
	}*/
	
	/*@RequestMapping("/home")
	public Model process() {
		Model model=new BindingAwareModelMap();
		model.addAttribute("age","val1");
		model.addAttribute("sysdate",LocalDateTime.now());
		return model;
	}*/
	
	/*@RequestMapping("/home")
	public Map<String,Object> process() {
		Map map=new HashMap();
		map.put("age","val1");
		map.put("sysdate",LocalDateTime.now());
		return map;
	}
	*/
	
	/*@RequestMapping("/home")
	public ModelAndView process(){
		ModelAndView mv=new ModelAndView();
		mv.addObject("age","val1");
		mv.addObject("sysdate",LocalDateTime.now());
		mv.setViewName("welcome");
		return mv;
		
		}*/
	
	/*@RequestMapping("/home")
	public void process(Map<String,Object>map){
		
		map.put("age","val1");
		map.put("sysdate",LocalDateTime.now());	
	   }*/
	
	/*@RequestMapping("/home")
	public String process(Map<String,Object>map){
		
		map.put("age","val1");
		map.put("sysdate",LocalDateTime.now());	
		return null;
	}*/
	
	@RequestMapping("/home")
	public String process(){
	  System.out.println("home requestMapping Method is Exceute::");
		return "forward:record";
	  }
	@RequestMapping("/record")
	public String welcomePage(Map<String,Object> map) {
		map.put("age","val1");
		map.put("sysdate",LocalDateTime.now());
		System.out.println("Welcome page is executed::");
		return "welcome";
	   }
	}
	

