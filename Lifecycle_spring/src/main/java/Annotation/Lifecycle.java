package Annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Lifecycle {
	
	@PostConstruct
	public void init() {
		System.out.println("Init method is invoked");
	}
	
	public void custom() {
		System.out.println("This is custom method");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Destroy method is invoked");
	}

}
