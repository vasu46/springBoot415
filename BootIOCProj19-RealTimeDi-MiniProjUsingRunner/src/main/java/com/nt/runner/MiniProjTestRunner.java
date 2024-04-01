package com.nt.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.nt.controller.StudentOperationsController;
import com.nt.model.Student;

public class MiniProjTestRunner implements CommandLineRunner {
	@Autowired
	private StudentOperationsController controller;

	@Override
	public void run(String... args) throws Exception {
		try {
		List<Student> list=controller.processStudentDetails("HYD", "VIZAG","DELHI");
		list.forEach(st->{
			System.out.println(st);
		});
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
