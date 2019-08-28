package com.sg.beans;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int calcArea() {
		return side * side;
	}

	public int calcPerimeter() {
		return 4 * side;
	}
}
