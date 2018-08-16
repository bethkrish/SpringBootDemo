package org.vijayforvictory.spring.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.vijayforvictory.spring.springboot.configuration.AppConfiguration;
import org.vijayforvictory.spring.springboot.model.Book;

/**
 * This is the main entry point for this app. 
 * 
 * This class has some bean configurations. It also includes other configuration classes (if any)
 * 
 */

@SpringBootApplication
@Configuration
@ComponentScan
@Import (AppConfiguration.class)
public class SpringBootDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);	
	}
	
	@Bean
	public Book book() {
		Book book = new Book();
		book.setTitle("Hello World");
		return book;
	}
}
