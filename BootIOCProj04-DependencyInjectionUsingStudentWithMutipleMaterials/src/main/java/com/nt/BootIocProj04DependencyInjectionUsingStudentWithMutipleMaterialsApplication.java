package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Student;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj04DependencyInjectionUsingStudentWithMutipleMaterialsApplication {

	public static void main(String[] args) {
		//create IOC CONTAINER
		ApplicationContext ctx=SpringApplication.run(BootIocProj04DependencyInjectionUsingStudentWithMutipleMaterialsApplication.class, args);
		Student student=ctx.getBean("st",Student.class);
		//invoke the Method
		student.preparation("vasu");
		
	}

}
