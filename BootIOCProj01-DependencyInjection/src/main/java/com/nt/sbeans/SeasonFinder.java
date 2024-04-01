package com.nt.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("sf")
public class SeasonFinder {
	@Autowired
	private LocalDate ldt;
	
	//b method
	public String findSeason() {
		//get Current Month
		int month=ldt.getMonthValue();
		if(month>=3 && month<6) 
			return "Summer Season";
		else if(month>=6 && month<9)
			return "Rainy season";
		else
			return "Winter Season";
	}
   
	
}
