package com.nt.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp")
@Data
@ConfigurationProperties(prefix="org.nit")
public class Company {
	private String name;
	private String addrs;
	private Long pincode;
	private Long phoneNumber;

}
