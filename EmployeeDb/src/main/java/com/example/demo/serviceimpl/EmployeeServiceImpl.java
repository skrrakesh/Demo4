package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Employeedao;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.module.Employee;
import com.example.demo.service.EmployeeService;


@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	Employeedao dao;
	
	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return dao.save(e);
	}

	@Override
	public Employee getById(Integer eid) {
		
		return dao.findById(eid).orElseThrow(()->new ResourceNotFoundException("Employee","Id ", eid));
	}

	@Override
	public List<Employee> getByDesignation(String designation) {
		// TODO Auto-generated method stub
		return dao.findByDesignation(designation);
	}

	@Override
	public List<Employee> getByLessSal(Double sal) {
		// TODO Auto-generated method stub
		return dao.findByLessSal(sal);
	}

	@Override
	public Employee updateEmployee(Employee e) {
		Employee e1=dao.findById(e.getEid()).orElse(null);
		if(e1!=null) {
			e1.setEname(e.getEname());
			e1.setSal(e.getSal());
			e1.setDesignation(e.getDesignation());
			e1.setPhno(e.getPhno());
			return dao.save(e1);
		}
		else {
			
				throw new ResourceNotFoundException("Employee","Id",e.getEid());
			
		}
		
	}

	

	
	

}
