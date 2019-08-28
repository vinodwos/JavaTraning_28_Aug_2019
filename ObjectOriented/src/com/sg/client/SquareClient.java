package com.sg.client;

import java.util.Scanner;

import com.sg.beans.Square;

public class SquareClient {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the side");
		final int side = scan.nextInt();

		Square s = new Square(side);

		System.out.printf("Area = %d\n", s.calcArea());
		System.out.printf("Perimeter = %d", s.calcPerimeter());
		scan.close();

	}
}
