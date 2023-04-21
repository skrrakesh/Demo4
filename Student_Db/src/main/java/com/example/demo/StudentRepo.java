package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepo extends CrudRepository<Student, Integer>{
	List<Student> findByEmail(String email);
	
//	@Query("select * from student where email=?1",nativeQuery=true)
//	List<Student> findByEmail(String email);
	
	
	@Query(value="select * from student order by phno",nativeQuery=true)
	List<Student> findByphnoasc();
	
	@Query(value="select * from student where  sname=?1",nativeQuery=true)
	List<Student> findBysname(String sname);
}
