package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // local host -> 8080
@RequestMapping("/demo")
public class DemoController {
	@RequestMapping("/home")
	public String display() {
		System.out.println("hi hello");
		return"";
	}
	// localhost:8080/demo/house
	@RequestMapping("/house")
	public String display1() {
		System.out.println("hello");
		return"";
	}
}
