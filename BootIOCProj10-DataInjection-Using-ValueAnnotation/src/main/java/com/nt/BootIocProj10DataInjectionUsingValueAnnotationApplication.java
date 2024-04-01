package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.PatientInfo;

@SpringBootApplication
public class BootIocProj10DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj10DataInjectionUsingValueAnnotationApplication.class, args);
		PatientInfo pi=ctx.getBean("pi",PatientInfo.class);
		System.out.println(pi);
		((ConfigurableApplicationContext) ctx).close();
	}

}
