package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootIocProj17DataInjectionYmlFlieUsingUserDefinedYmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj17DataInjectionYmlFlieUsingUserDefinedYmlApplication.class, args);
		Customer cust=ctx.getBean("cust",Customer.class);
		System.out.println(cust);
	}

}
