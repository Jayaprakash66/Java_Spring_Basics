package Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(config_annot.class);
		Lifecycle l=(Lifecycle)context.getBean("lifecycle");
		l.custom();
	}

}
