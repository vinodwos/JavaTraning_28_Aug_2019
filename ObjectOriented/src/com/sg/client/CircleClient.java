package com.sg.client;

import java.util.Scanner;

import com.sg.beans.Circle;

public class CircleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the radius");
		int radius = scan.nextInt();
		Circle c = new Circle();
		try {
			c.setRadius(radius);
			double area = c.calcAreaOfCircle();
			double pm = c.calcPerimeterOfCircle();

			System.out.println("Area = " + area);
			System.out.println("Perimeter = " + pm);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
