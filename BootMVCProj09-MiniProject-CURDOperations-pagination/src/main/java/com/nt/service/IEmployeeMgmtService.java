package com.nt.service;




import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.nt.model.Employee;

public interface IEmployeeMgmtService {
	public Iterable<Employee> getAllEmployees();
    public String registerEmployee(Employee emp);
    public Employee getEmployeeByNo(int eno);
    public String updateEmployee(Employee emp);
    public String deleteEmployee(int eno);
    
    public Page<Employee> getEmployeesReportDataByPage(Pageable pageable);
    
}
