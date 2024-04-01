package com.nt.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator {
	@Autowired
	private LocalTime ldt;
	
	WishMessageGenerator(){
		System.out.println("WIshMeassage Generator 0-param Constructor::");
	}
	//write the B.logis
	public String wishMessage() {
		//get cuurent Hour
		int hour=ldt.getHour();
		if(hour<12)
			return "Good MOrning";
		else if(hour<16)
			return "Good OfterNoon";
		else if(hour<20)
			return "Good Evening";
		else
			return "Good Night";
	}
	

}
