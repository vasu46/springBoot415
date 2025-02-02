package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootIocProj14DataInjectionUsingAllTypesArraysCollectionsSimpleHasAApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj14DataInjectionUsingAllTypesArraysCollectionsSimpleHasAApplication.class, args);
	    Employee emp=ctx.getBean("emp",Employee.class);
	    System.out.println(emp);
	    ((ConfigurableApplicationContext) ctx).close();
	}

}
