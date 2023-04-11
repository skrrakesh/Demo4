package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoController1 {
	@RequestMapping("/wel")
	String demo() {
		System.out.println("welcome");
		return "";
	}
}
