package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Employee e1=(Employee)context.getBean("e1");
		System.out.println(e1.toString());
		Employee e2=(Employee)context.getBean("e2");
		System.out.println(e2.toString());

	}

}
