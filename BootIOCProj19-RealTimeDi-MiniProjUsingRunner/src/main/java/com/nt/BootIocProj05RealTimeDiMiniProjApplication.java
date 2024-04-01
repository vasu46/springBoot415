package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.controller.StudentOperationsController;
import com.nt.model.Student;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootIocProj05RealTimeDiMiniProjApplication {

	public static void main(String[] args) {
		//get ApplicationContext Contrainer
	SpringApplication.run(BootIocProj05RealTimeDiMiniProjApplication.class, args);
		
	}
}
