package com.nt.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IStudentDAO;
import com.nt.model.Student;

@Service("studService")
public class StudentMgmtImpl implements IStudentMgmt {
	
	@Autowired
	private IStudentDAO studDAO;

	@Override
	public List<Student> fetchStudentDetailsByAddress(String city1, String city2, String city3) throws Exception {
		//use Dao
		List<Student> list=studDAO.getAllStudentByAddress(city1, city2, city3);
		//fro each
		list.forEach(st->
		   {
			   String result=null;
			  if(st.getAvg()<35)
				  result="FAIL";
			  else if(st.getAvg()>=35 && st.getAvg()<=50)
				  result="Third Class";
			  else if(st.getAvg()>50 && st.getAvg()<=60)
				  result="SecondClass";
				  else if(st.getAvg()>=60 && st.getAvg()<=75)
					  result="FirstClass";
				  else
					  result="FirstClass with distanction";
			  st.setResult(result);  
		   });
		
		return list;
	}
	
	

}
