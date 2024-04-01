package com.nt;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootShedulingProj01Application {

	public static void main(String[] args) {
		SpringApplication.run(BootShedulingProj01Application.class, args);
		System.out.println("App Starting at::"+new Date());
	}

}
