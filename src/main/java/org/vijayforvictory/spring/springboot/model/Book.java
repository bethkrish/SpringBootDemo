package org.vijayforvictory.spring.springboot.model;

import java.io.Serializable;

public class Book implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String title;

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 * @return 
	 */
	public void setTitle(String title) {
		this.title = title;
	}

}
