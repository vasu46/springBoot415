package com.nt.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service("season")
public class SesonFinderServiceImpl implements ISeasonFinderService {

	@Override
	public String seasonFinder() {
		//get sYSTEM Date and Time 
		LocalDateTime ldt=LocalDateTime.now();
		int month=ldt.getMonthValue();
		if(month>=7 && month<=9)
		return "Rainy Season";
		
		else if(month>=3 && month<=6)
			return "SummerSeason";
		else
			return "WinterSeason";
	}

}
