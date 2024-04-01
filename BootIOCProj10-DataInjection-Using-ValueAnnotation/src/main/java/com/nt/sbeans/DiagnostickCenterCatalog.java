package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("dcc")
@Data
public class DiagnostickCenterCatalog {
	@Value("${dc.xrayprice}")
	private Float XRayPrice;
	
	@Value("${dc.ctsacnprice}")
	private Float ctScan;
	
	@Value("${dc.mriscan}")
	private Float MRIScan;
	
	@Value("${dc.ecgprice}")
	private Float ecgPrice;
	

}
