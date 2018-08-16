package org.vijayforvictory.spring.springboot.model;


public class Car {
	private Wheel wheel;
	private String model;
	
	/**
	 * @return the model
	 */
	public String getModel() {
		return model;
	}
	/**
	 * @param model the model to set
	 */
	public void setModel(String model) {
		this.model = model;
	}
	public Car() {
		
	}
	/**
	 * @return the wheel
	 */
	public Wheel getWheel() {
		return wheel;
	}

	/**
	 * @param wheel the wheel to set
	 */
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}


	
}
