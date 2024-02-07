package edu.jsp.demo;

import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	Demo(){
		System.out.println("Demo Class Constructor is called");
	}
	public void m1() {
		System.out.println("M1 Method is executing");
	}

}
