package com.nt.model;

import java.io.Serializable;

import lombok.Data;
@Data
public class Employee implements Serializable{
	private Integer empno;
	private String ename;
	private String job;
	private Integer deptno;
	private Float sal;
	
	

}
