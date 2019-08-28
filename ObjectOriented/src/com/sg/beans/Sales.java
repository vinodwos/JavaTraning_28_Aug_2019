package com.sg.beans;

public class Sales {
	public static int count;
	public static double tsales;
	
	private String name;
	private double samt;
	public Sales(String name, double samt) {
		super();
		this.name = name;
		this.samt = samt;
		++count;
		tsales += this.samt;
	}
	
	
}
