package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;


// @Controller --> it contains business logic // it is used control the web services.S
@Component
//@Scope(value="prototype") --> singleton,prototype
public class Student {
	@Autowired
	@Qualifier("1")
	College c;
	//College c=new College();
	Student(){
		System.out.println("Student Constructor");
	}
	void display() {
		System.out.println("Hello Student");
		c.fee();
	}
	
	
}
