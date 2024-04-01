package com.nt.sbeans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component("cust")
@Data
public class Customer {
	private Integer custNo;
	private String custName;
	private String custAddrs;
	private double billAmt;
	

}
