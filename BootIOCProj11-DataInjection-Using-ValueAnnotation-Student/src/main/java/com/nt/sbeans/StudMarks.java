package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("studM")
@Data
public class StudMarks {
	@Value("${stud.marks.ss}")
	private Integer SignalSystem;
	
	@Value("${stud.marks.dd}")
	private Integer DscDica;
	
	@Value("${stud.marks.es}")
	private Integer es;
	
	@Value("${stud.marks.dsc}")
	private Integer Dsc;
	
	@Value("${stud.marks.pdc}")
	private Integer pdc;
	
	
	

}
