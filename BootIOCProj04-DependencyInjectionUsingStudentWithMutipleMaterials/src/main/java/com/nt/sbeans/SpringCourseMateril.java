package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("spring")
public class SpringCourseMateril implements IMaterial{

	@Override
	public void preparationStart() {
		System.out.println("Prepartion start spring");
		
	}

	@Override
	public void preparationStop() {
	System.out.println("Prepartion stop spring");
		
	}

}
