package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Student;
import com.nt.service.IStudentMgmt;


@Controller("studController")
public class StudentOperationsController {
	@Autowired
	private IStudentMgmt studservice;
	
	public List<Student> processStudentDetails(String city1,String city2,String city3)throws Exception{
		 List<Student> list =studservice.fetchStudentDetailsByAddress(city1,city2,city3);
		 return list;
				}

}
