package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vechicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj03DependencyInjectionUsingMultipleDcApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj03DependencyInjectionUsingMultipleDcApplication.class, args);
		Vechicle vech=ctx.getBean("vechicle",Vechicle.class);
		vech.journy("NUZVID","HYDHARABAD");
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
