package com.nt.dao;

import java.util.List;

import com.nt.model.Student;

public interface IStudentDAO {
	public List<Student> getAllStudentsByAddress(String city1,String city2,String city3)throws Exception;

}
