package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("st")
public class Student {
	@Qualifier("book")
	@Autowired
	private IMaterial material;
	
	public void preparation(String name) {
		System.out.println("preparation start::");
		material.preparationStart();
		System.out.println(name+"::Prepartion start subject::");
		System.out.println("Preparation going on:::");
		material.preparationStop();
		System.out.println(name+"::preaparation stop subject:");
	}
	

}
