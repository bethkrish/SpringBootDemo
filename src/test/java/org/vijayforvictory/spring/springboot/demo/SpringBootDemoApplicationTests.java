package org.vijayforvictory.spring.springboot.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.vijayforvictory.spring.springboot.model.Book;
import org.vijayforvictory.spring.springboot.model.Car;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemoApplicationTests {

	@Autowired
	private Book book;
	
	@Autowired
	private Car car;
	
	/**
	 * Context Loads 
	 */
	@Test
	public void contextLoads() {
		
	}

	@Test
	public void testBookTitle() {
		System.out.println("Book Title " + book.getTitle());
	}
	
	@Test
	public void testCar() {
		System.out.println("Car Model " + car.getModel());
	}
}
