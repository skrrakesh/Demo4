package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("2")
public class EWIT extends College{
	
	public void fee() {
		System.out.println("sdf");
	}
}
