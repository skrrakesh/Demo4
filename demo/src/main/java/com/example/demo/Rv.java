package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("1") // --> giving priorities
public class Rv extends College{
	public void fee() {
		System.out.println("1234567gfds");
	}
}
