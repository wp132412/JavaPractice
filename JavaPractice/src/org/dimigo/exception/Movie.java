package org.dimigo.exception;

public class Movie {
	private String title;
	private int limitAge;
	
	public Movie() {
		// TODO Auto-generated constructor stub
	}

	public Movie(String title, int age) {
		this.title = title;
		this.limitAge = age;
	}
	
	public String getTitle() {
		return title;
	}
	
	public int getLimitAge() {
		return limitAge;
	}

}
