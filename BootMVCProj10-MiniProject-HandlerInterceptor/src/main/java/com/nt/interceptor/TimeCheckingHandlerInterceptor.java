package com.nt.interceptor;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class TimeCheckingHandlerInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse resp, Object handler)
			throws Exception {
		System.out.println("TimeCheckingHandlerInterceptor.preHandle()");
	     //get LocalDateAndTime
		LocalDateTime ldt=LocalDateTime.now();
		//get Current Hour
		int hour=ldt.getHour();
		if(hour>=9 && hour<=17) {
			 System.out.println("TimeCheckingHandlerInterceptor.preHandle()");
			return true;
		   }
		 else {
			 if(req.getServletPath().equalsIgnoreCase("/")) {
				 return true;
		        }
			 RequestDispatcher rd=req.getRequestDispatcher("/timeout.jsp");
		     rd.forward(req, resp);
			return false;
		 }
		
	}
	

}
