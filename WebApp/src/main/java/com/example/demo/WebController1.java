package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController1 {
	@RequestMapping("home")
	String home() {
		return "form.jsp";
	}
	
	@RequestMapping("index")
	String index(HttpSession h1,Student s) {
		h1.setAttribute("sid", s.getSid());
		h1.setAttribute("sname", s.getSname());
		return "index.jsp";
	}
}
