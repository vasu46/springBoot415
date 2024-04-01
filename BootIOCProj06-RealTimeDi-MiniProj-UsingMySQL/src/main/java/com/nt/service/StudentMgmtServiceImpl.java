package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.model.Student;

@Service("studService")
public class StudentMgmtServiceImpl implements IStudentMgmtService{
	@Autowired
	private IStudentDAO studDAO;

	@Override
	public List<Student> fetchStudentDeatilsByAddress(String city1, String city2, String city3) throws Exception {
		List<Student> list=studDAO.getAllStudentsByAddress(city1, city2, city3);
		//calculate 
		list.forEach(st->{
			String result=null;
			if(st.getAvg()<35)
				 result="Fail";
			else if(st.getAvg()>35 && st.getAvg()<50)
			  result="Third Class";
			else if(st.getAvg()>=50 && st.getAvg()<75)
				result="Second Class";
			else
				result="First Class";
			
			st.setResult(result);
		});
		return list;
	}
	

}
