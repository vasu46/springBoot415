package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository("ora_studDAO")
@Profile({"uat","prod"})
public class OracleStudentDAOImpl implements IStudentDAO {
	private static final String GET_ALL_STUDENTS_BY_ADDRESS="SELECT SNO,SNAME,SADD,AVG FROM STUDENT WHERE SADD IN(?,?,?) ORDER BY SADD";
     
	@Autowired
	private DataSource ds;

	@Override
	public List<Student> getAllStudentByAddress(String city1, String city2, String city3) throws Exception {
		List<Student> list=null;
		try(Connection con=ds.getConnection();
				PreparedStatement ps=con.prepareStatement(GET_ALL_STUDENTS_BY_ADDRESS);){
			//set input values
			ps.setString(1,city1);
			ps.setString(2, city2);
			ps.setString(3, city3);
			
			//execute the query
		try(ResultSet rs=ps.executeQuery()){
			  //process the ResultSet
			list=new ArrayList<Student>();
			  while(rs.next()) {
				 Student st=new Student();
				 st.setSno(rs.getInt(1));
				 st.setSname(rs.getString(2));
				 st.setSaddrs(rs.getString(3));
				 st.setAvg(rs.getFloat(4));
				 
				 list.add(st);
				 }//while
		    }//try2
		}//try1
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}//method

}//calss
