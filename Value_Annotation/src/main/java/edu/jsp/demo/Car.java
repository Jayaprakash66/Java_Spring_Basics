package edu.jsp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class Car {
	@Value("BMW")
	private String name;
	@Value("Blue")
	private String color;
	@Value("M5")
	private String model;
	@Value("10000000")
	private double price;
	@Autowired
	private Engine e;
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + ", model=" + model + ", price=" + price + ", e=" + e + "]";
	}
}
