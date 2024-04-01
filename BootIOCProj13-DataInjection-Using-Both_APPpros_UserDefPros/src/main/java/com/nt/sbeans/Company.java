package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("comp")
@Data
@ConfigurationProperties(prefix="org.nit")
@PropertySource("app.properties")
public class Company {
	private String name;
	private String addrs;
	private Long pincode;
	private Long phoneNumber;
	
	@Value("${nit.size}")
	private int size;

}
