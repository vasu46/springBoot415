package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Employee;

@Repository("Empdao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	private static final String Get_Employee_Details_By_Job="SELECT EMPNO,ENAME,JOB,SAL,DEPTNO FROM EMP WHERE JOB IN(?,?,?)ORDER BY JOB";
	@Autowired
	private DataSource ds;

	@Override
	public List<Employee> getEmployeeDetailsByJob(String desg1, String desg2, String desg3) throws Exception {
		List<Employee> list=null;
		try (Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(Get_Employee_Details_By_Job);){
			//set input values
			ps.setString(1, desg1);
			ps.setString(2, desg2);
			ps.setString(3, desg3);
			
			//execute the query
			try(ResultSet rs=ps.executeQuery()){
				list=new ArrayList<Employee>();
				while(rs.next()) {
					Employee e=new Employee();
					e.setEmpno(rs.getInt(1));
					e.setEname(rs.getString(2));
					e.setJob(rs.getString(3));
				    e.setSal(rs.getFloat(4));
				    e.setDeptno(rs.getInt(5));
				    list.add(e);	
				}//while
				
			}//try
		}//try2
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}
	

}
