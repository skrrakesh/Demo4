package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.module.Employee;

public interface Employeedao extends JpaRepository<Employee, Integer>{

	
	@Query(value="select * from Employee where designation=?1", nativeQuery = true)
	List<Employee> findByDesignation(String designation);
	
	@Query(value="select * from Employee where sal<=?1", nativeQuery = true)
	List<Employee> findByLessSal(Double sal);
	
	@Query(value="update Employee set designation=?1 where id=?2",nativeQuery = true)
	Employee updateEmployee(Employee e);
}
