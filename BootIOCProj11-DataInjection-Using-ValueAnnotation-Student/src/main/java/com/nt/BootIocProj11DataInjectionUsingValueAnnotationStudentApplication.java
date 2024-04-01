package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.StudDetails;

@SpringBootApplication
public class BootIocProj11DataInjectionUsingValueAnnotationStudentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj11DataInjectionUsingValueAnnotationStudentApplication.class, args);
		StudDetails stud=ctx.getBean("studD",StudDetails.class);
		System.out.println(stud);
		((ConfigurableApplicationContext) ctx).close();
	}

}
