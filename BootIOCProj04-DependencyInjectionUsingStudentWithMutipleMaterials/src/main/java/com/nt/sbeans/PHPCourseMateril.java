package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("php")
public class PHPCourseMateril implements IMaterial{

	@Override
	public void preparationStart() {
		System.out.println("Prepartion start");
		
	}

	@Override
	public void preparationStop() {
	System.out.println("Prepartion stop");
		
	}

}
