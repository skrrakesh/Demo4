package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component 
//@Primary --> only for susper class
//@Qualifier --> only for subclass
public class College { // class should always be class not interface
 public void fee() {
	 System.out.println("feeee");
 }
}
