package com.sg.demos;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner scan = new Scanner(System.in);
		// System.out.println("Enter the radius");
		// int radius = scan.nextInt();
		// double area = calcAreaOfCircle(radius);
		// double pm = calcPerimeterOfCircle(radius);
		//
		// System.out.println("Area = " + area);
		// System.out.println("Perimeter = " + pm);

		Complex c1 = new Complex(10, 15);

		Object o = c1;

		System.out.println(o);
	}

	public static double calcAreaOfCircle(int radius) {
		return radius * 3.14;
	}

	public static double calcPerimeterOfCircle(int radius) {
		return 2 * 3.14 * radius;
	}

}

class Complex {
	private double re, im;

	public Complex(double re, double im) {
		this.re = re;
		this.im = im;
	}

	/*
	 * Returns the string representation of this Complex number. The format of
	 * string is "Re + iIm" where Re is real part and Im is imagenary part.
	 */
	@Override
	public String toString() {
		// System.out.println(super.toString());
		return String.format(re + " + i" + im);
	}
}
