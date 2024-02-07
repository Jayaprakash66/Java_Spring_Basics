package edu.jsp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("1000")
	private String cc;
	@Value("150horsepower")
	private String power;
	@Override
	public String toString() {
		return "Engine [cc=" + cc + ", power=" + power + ", capacity=" + capacity + "]";
	}
	@Value("100")
	private String capacity;
	

}
