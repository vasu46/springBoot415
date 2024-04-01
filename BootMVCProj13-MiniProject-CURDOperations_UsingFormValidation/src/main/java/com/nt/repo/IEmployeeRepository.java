package com.nt.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.nt.model.Employee;

public interface IEmployeeRepository extends CrudRepository<Employee,Integer> {

	

}
