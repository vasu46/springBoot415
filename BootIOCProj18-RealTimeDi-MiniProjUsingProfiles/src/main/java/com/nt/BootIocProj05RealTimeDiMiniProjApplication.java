package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.StudentOperationsController;
import com.nt.model.Student;

@SpringBootApplication
public class BootIocProj05RealTimeDiMiniProjApplication {

	public static void main(String[] args) {
		//get ApplicationContext Contrainer
		ApplicationContext ctx=SpringApplication.run(BootIocProj05RealTimeDiMiniProjApplication.class, args);
		//getControlelr Calss
		StudentOperationsController controller=ctx.getBean("studController",StudentOperationsController.class);
		//invoke the Method
		  try {
		List<Student> list=controller.processStudentDetails("HYD", "VIZAG","DELHI");
		System.out.println(list);
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
	}

}
