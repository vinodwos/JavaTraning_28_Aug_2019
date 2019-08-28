package com.sg.service;

public class Cylinder implements IShape {
	private double radius;
	private double height;

	@Override
	public double calcVolume() {
		return Math.PI * radius * radius * height;
	}

	@Override
	public void readData() {
		System.out.println("enter the radius");
		this.radius = scan.nextDouble();
		System.out.println("enter the height");
		this.height = scan.nextDouble();

	}
}
