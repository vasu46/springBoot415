package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;
@Service("EmpService")
public class EmployeeMgmtService implements IEmployeeMgmtService {
	@Autowired
	private IEmployeeDAO empdao;

	@Override
	public List<Employee> fetchEmployeeDetalisByJob(String desg1, String desg2, String desg3) throws Exception {
		List<Employee>list=empdao.getEmployeeDetailsByJob(desg1, desg2, desg3);
		return list;
	}

}
