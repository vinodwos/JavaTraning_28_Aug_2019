package com.sg.demos;

import java.util.Scanner;

public class Intrest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Principle");
		int p = scan.nextInt();
		System.out.println("Enter the Rate of Intrest");
		int i = scan.nextInt();
		System.out.println("Enter the Period");
		int t = scan.nextInt();
		
		
		double simpleIntrest = calcSimpleIntrest(p,i,t);
		double compoundIntrest = calcCompoundIntrest(p,i,t);
		
		System.out.println("Simple Intrest = " + simpleIntrest);
		System.out.println("Compound Intrest = " + compoundIntrest);
	}

	public static double calcSimpleIntrest(double p, float i, int t) {
		return p * i * t/100;
	}

	public static double calcCompoundIntrest(double p, float i, int t) {
		return p * (Math.pow((1 + i / 100), t) - 1);
	}
}
