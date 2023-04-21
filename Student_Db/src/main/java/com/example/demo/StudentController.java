package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class StudentController {
	@Autowired
	StudentRepo repo;
	@RequestMapping("/addStudent")
	String form() {
		return"details.jsp";
	}
	
	@RequestMapping("/saveStudent")
	String saveStudent(Student s) {
		repo.save(s);
		return"details.jsp";
	}
	
	@RequestMapping("/detailsById")
	String detailsById(HttpSession h1,Integer sid) {
		Student s=repo.findById(sid).orElse(null);
		h1.setAttribute("sid", s.getSid());
		h1.setAttribute("sname", s.getSname());
		h1.setAttribute("email", s.getEmail());
		h1.setAttribute("phno", s.getPhno());
		return"view.jsp";
	}
	
	@RequestMapping("/deleteById")
	String deleteStudent(HttpSession h1,Integer sid) {
		Student s=repo.findById(sid).orElse(null);
		if(s!=null) {
			h1.setAttribute("message","Student with id "+sid+" got deleted");
		repo.deleteById(sid);
		}
		else {
			h1.setAttribute("message", "Invalid Id");
		}
		return"details.jsp";
	}
	@RequestMapping("/byemail")
	@ResponseBody
	List<Student> findStdByEmail(String email) {
		
		System.out.println(repo.findByEmail(email));
		return repo.findByEmail(email);
		}
	
	@RequestMapping("/phnoasc")
	@ResponseBody
	List<Student> findByphnoasc(){ 
		return repo.findByphnoasc();
		
	}
	@RequestMapping("/bysname")
	@ResponseBody
	List<Student> findBysname(String sname){
		return repo.findBysname(sname);
	}
}
