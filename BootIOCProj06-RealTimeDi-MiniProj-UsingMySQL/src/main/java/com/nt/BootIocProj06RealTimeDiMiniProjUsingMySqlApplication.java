package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.StudentOperationsByData;
import com.nt.model.Student;

@SpringBootApplication
public class BootIocProj06RealTimeDiMiniProjUsingMySqlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj06RealTimeDiMiniProjUsingMySqlApplication.class, args);
		StudentOperationsByData controller=ctx.getBean("studControlelr",StudentOperationsByData.class);
		   try {
			List<Student>list=controller.processStudentData("HYD", "VIZAG","DELHI");
			System.out.println(list);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		   
	}

}
