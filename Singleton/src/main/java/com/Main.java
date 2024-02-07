package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(config_single.class);
		Team t1=(Team)context.getBean("team");
		Team t2=(Team)context.getBean("team");
		System.out.println(t1);
		System.out.println(t2);
	}

}
