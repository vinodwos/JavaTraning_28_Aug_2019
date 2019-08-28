package com.sg.beans;

public class Circle {
	
	private int radius;

	public  double calcAreaOfCircle() {
		return radius * radius * 3.14;
	}

	public double calcPerimeterOfCircle() {
		return 2 * 3.14 * radius;
	}

	public void setRadius(int radius) throws Exception {
		if(radius <0 ){
			throw new Exception("Radius must be grater then 0!");
		}
		this.radius = radius;
	}
}
