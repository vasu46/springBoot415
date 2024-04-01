package com.nt;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootIocProj16DataInjectionYmlFlieUsingArryListSetMapApplication {

	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(BootIocProj16DataInjectionYmlFlieUsingArryListSetMapApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		ApplicationContext ctx=app.run(args);
	    Employee emp=ctx.getBean("emp",Employee.class);
	    System.out.println(emp);
	}

}
