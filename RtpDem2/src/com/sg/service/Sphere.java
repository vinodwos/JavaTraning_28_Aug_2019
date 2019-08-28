package com.sg.service;

public class Sphere implements IShape {
	private double radius;

	@Override
	public double calcVolume() {
		return 4 / 3 * Math.PI * radius * radius * radius;
	}

	@Override
	public void readData() {
		System.out.println("enter the radius");
		this.radius = scan.nextDouble();
	}
}
