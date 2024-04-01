package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vechicle;

@SpringBootApplication
public class BootIocProj03DependencyInjectionUsingMultipleDcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj03DependencyInjectionUsingMultipleDcApplication.class, args);
		Vechicle vech=ctx.getBean("vechicle",Vechicle.class);
		vech.journy("NUZVID","HYDHARABAD");
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
