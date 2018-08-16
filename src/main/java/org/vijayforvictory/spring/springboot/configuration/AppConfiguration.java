package org.vijayforvictory.spring.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.vijayforvictory.spring.springboot.model.Book;
import org.vijayforvictory.spring.springboot.model.Car;
import org.vijayforvictory.spring.springboot.model.Wheel;

@Configuration
@ComponentScan
public class AppConfiguration {
	
	@Bean
	public Car car() { 
		Car car = new Car();
		car.setModel("Honda");
		return car;
	}
	//Comment
	
	@Bean
	public Wheel wheel() {
		Wheel wheel = new Wheel();
		wheel.setName("My Wheel");
		return wheel;
	}
}