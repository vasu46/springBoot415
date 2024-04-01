package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DependencyInjectionApplication {
	@Bean(name="id")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj01DependencyInjectionApplication.class, args);
		//get Tarhet calss spring bran
		SeasonFinder finder=ctx.getBean("sf",SeasonFinder.class);
		String seasonNmae=finder.findSeason();
		System.out.println("Current season is::"+seasonNmae);
	}

}
