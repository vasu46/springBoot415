package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Cengg")
public class CNGEngine implements IEngine {
	public CNGEngine() {
		System.out.println("CNGEngine 0-param Constructor::");
	}

	@Override
	public void start() {
	    System.out.println("CNG Engine is Started");
		
	}

	@Override
	public void stop() {
		System.out.println("CNG Engine is Stop:;");
		
	}

}
