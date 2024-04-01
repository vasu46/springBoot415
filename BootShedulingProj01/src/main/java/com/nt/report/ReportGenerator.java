package com.nt.report;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component("/report")
public class ReportGenerator {
	/*@Scheduled(initialDelay=2000,fixedDelay=3000)
	public void generateSalesReport() {
		System.out.println("SalesReport on::"+new Date());		
	}*/
	
	/*@Scheduled(initialDelay=2000,fixedDelay=3000)
	public void generateSalesReport(int arg,int end) {
		System.out.println("SalesReport on::"+new Date());
		
	}
	*/
	/*@Scheduled(fixedDelay=3000)
	public void generateSalesReport() {
		System.out.println("SalesReport on::"+new Date());
		
	}*/
	
	/*@Scheduled(fixedDelay=3000)
	public void generateSalesReport() {
		System.out.println("StartSalesReport on::"+new Date());
		try {
			Thread.sleep(15000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end SalesReport on::"+new Date());
		
		
	}*/
	
	@Scheduled(fixedRate=3000)
	public void generateSalesReport() {
		System.out.println("StartSalesReport on::"+new Date());
		try {
			Thread.sleep(15000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println(" end SalesReport on::"+new Date());
		
		
	}
	
}
