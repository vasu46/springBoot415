package com.nt;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootIocProj02WishMessageGeneratorDiApplication {
	   @Bean("ldt")
	 public LocalTime createTime() {
		 return LocalTime.now();
	 }

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj02WishMessageGeneratorDiApplication.class, args);
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		String msg=generator.wishMessage();
		System.out.println("WishMESSAGE::"+msg);
	((ConfigurableApplicationContext)ctx).close();
		
	}

}
