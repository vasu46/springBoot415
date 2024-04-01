package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("pi")
@Data
public class PatientInfo {
	@Value("12345")
	private Integer pid;
	
	@Value("${p.name}")
	private String pname;
	@Value("${p.phoneno}")
	private Long mobileNo;
	
	@Value("${p.addrs}")
	private String addrs;
	
	@Value("#{dcc.XRayPrice+dcc.ctScan+dcc.MRIScan}")
	private Float billAmount;
	
	@Value("#{dcc.ecgPrice<=0}")
	private Boolean ecgfree;

	@Override
	public String toString() {
		return "PatientInfo [pid=" + pid + ", pname=" + pname + ", mobileNo=" + mobileNo + ", addrs=" + addrs
				+ ", billAmount=" + billAmount + ", ecgfree=" + ecgfree + "]";
	}
	 
	

}
