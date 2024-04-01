package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootIocProj15DataInjectionYmlFlieApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj15DataInjectionYmlFlieApplication.class, args);
		Customer cust=ctx.getBean("cust",Customer.class);
		System.out.println(cust);
		((ConfigurableApplicationContext) ctx).close();
	}

}
