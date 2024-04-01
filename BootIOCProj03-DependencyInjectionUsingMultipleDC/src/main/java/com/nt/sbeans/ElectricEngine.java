package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Eengg")
public class ElectricEngine implements IEngine {
	public ElectricEngine() {
		System.out.println("Electric Engine 0-param Constructor::");
	}

	@Override
	public void start() {
	    System.out.println("Electric Engine is Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Electric Engine is Stop:;");
		
	}

}
