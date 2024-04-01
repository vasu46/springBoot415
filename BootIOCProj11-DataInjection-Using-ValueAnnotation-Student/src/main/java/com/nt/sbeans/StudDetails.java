package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("studD")
@Data
public class StudDetails {
	
	
	@Value("15NQ1A0440")
	private String sno;
	
	@Value("${stud.name}")
	private String sname;
	
	@Value("${stud.addrs}")
	private String addrs;
	
	@Value("#{studM.SignalSystem+studM.DscDica+studM.es+studM.Dsc+studM.pdc}")
	private Integer total;
	
	@Value("#{(studM.SignalSystem+studM.DscDica+studM.es+studM.Dsc+studM.pdc)/5}")
	private Float avg;
	
}	
   
  