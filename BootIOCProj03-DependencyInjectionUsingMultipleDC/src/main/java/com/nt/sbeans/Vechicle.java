package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vechicle")
public class Vechicle {
	@Qualifier("Cengg")
	@Autowired
	private IEngine engine;
	
	public Vechicle() {
		System.out.println("Vechile 0-parma constructor::");
	}
   public void journy(String sourcepalce,String destinationpalce) {
	   System.out.println("vechicle.journy");
	   engine.start();
	   System.out.println("Journey start to::"+sourcepalce);
	   System.out.println("Journey is going on::");
	   engine.stop();
	   System.out.println("journy end in::"+destinationpalce);
	   
          }
		
	

}
