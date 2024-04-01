package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotel")
public class Hotel {
	@Value("2525")
	private Integer hotelId;
	
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${hotel.addrs}")
	private String hotelAddrs;
	
	@Value("${hotel.contactno}")
	private String contactNo;
	
	@Value("${customer.name}")
	private String custName;
	
	@Value("#{menup.dosaPrice + menup.idlyPrice}")
	private Float billAmount;
	
	@Value("${os.name}")
	private String osName;
	
	@Value("${user.name}")
	private String browser;
	
	@Value("${path}")
	private String path;

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", hotelAddrs=" + hotelAddrs + ", contactNo="
				+ contactNo + ", custName=" + custName + ", billAmount=" + billAmount + ", osName=" + osName
				+ ", browser=" + browser + ", path=" + path + "]";
	}
	 
	

}
