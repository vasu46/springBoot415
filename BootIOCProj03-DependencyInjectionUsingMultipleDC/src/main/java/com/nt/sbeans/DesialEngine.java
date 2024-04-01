package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("Dengg")
public class DesialEngine implements IEngine {
	public DesialEngine() {
		System.out.println("DesialEngine 0-param Constructor::");
	}

	@Override
	public void start() {
	    System.out.println("Desial Engine is Started");
		
	}

	@Override
	public void stop() {
		System.out.println("DesialEngine is Stop:;");
		
	}

}
