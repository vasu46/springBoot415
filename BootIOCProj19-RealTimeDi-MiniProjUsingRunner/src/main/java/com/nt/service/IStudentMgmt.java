package com.nt.service;

import java.util.List;
import com.nt.model.Student;

public interface IStudentMgmt {
	public List<Student> fetchStudentDetailsByAddress(String city1,String city2,String city3)throws Exception;

}
