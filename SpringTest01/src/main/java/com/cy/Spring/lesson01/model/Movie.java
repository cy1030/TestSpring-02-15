package com.cy.Spring.lesson01.model;

public class Movie {
	private int rate;
	private String director;
	private int time;
	private String title;
	
	public int getRate() {
		return this.rate;
	}
	public String getDirector() {
		return this.director;
	}
	public int getTime() {
		return this.time;
	}
	public String getTitle() {
		return this.title;
	}
	
	public void setRate(int rate) {
		this.rate = rate;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
