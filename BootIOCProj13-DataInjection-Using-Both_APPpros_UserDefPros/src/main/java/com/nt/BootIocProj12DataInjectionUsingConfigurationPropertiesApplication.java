package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootIocProj12DataInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj12DataInjectionUsingConfigurationPropertiesApplication.class, args);
		Company com=ctx.getBean("comp",Company.class);
		System.out.println(com);
		((ConfigurableApplicationContext) ctx).close();
	}

}
