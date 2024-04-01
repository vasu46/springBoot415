package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Pengg")
public class PetrolEngine implements IEngine {
	public PetrolEngine() {
		System.out.println("PetrolEngine 0-param Constructor::");
	}

	@Override
	public void start() {
	    System.out.println("Petrol Engine is Started");
		
	}

	@Override
	public void stop() {
		System.out.println("Petrol Engine is Stop:;");
		
	}

}
