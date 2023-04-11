package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebApp {
	@RequestMapping("/display")
	@ResponseBody
	String display() {
		return"hello";
	}
	
	@RequestMapping("/csk")
	@ResponseBody
	String display1() {
		return"<h1>Dhoni And Raina<h1>";
	}
	
	@RequestMapping("/csk1")
	@ResponseBody // --> It'll display on the web page
	String display2() {
		return"<input type='text' placeholder='name'>" ;
	}
	// http://localhost:8080/input?name=Dhoni
	@RequestMapping("/input")
	@ResponseBody
	String display3(String name) {
		return"Hello "+name ;
	}

}
