package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.servlet.http.HttpSession;

@Controller
public class WebController {
	@RequestMapping("/app")
	String display() {
		return "home.jsp";
	}
	
	@RequestMapping("/app1")
	String display1(HttpSession h1,Student s) {
		h1.setAttribute("name", s);
		return"home.jsp";
	}

}
