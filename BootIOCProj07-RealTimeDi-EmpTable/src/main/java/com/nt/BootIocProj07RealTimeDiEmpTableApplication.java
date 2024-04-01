package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;

@SpringBootApplication
public class BootIocProj07RealTimeDiEmpTableApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj07RealTimeDiEmpTableApplication.class, args);
		EmployeeController controller=ctx.getBean("empController",EmployeeController.class);
		try {
		List<Employee>list=controller.processTheEmployeeDetails("CLERK","SALESMAN","ANALYST");
		 list.forEach(st->{
			 System.out.println(st);
		 });
	}
		catch(Exception e) {
			e.printStackTrace();
		
		}
	}
}
