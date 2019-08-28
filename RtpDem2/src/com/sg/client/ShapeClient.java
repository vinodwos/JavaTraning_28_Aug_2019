package com.sg.client;


import com.sg.service.IShape;
import com.sg.service.ShapeFactory;

public class ShapeClient {

	public static void main(String[] args) {
		String opt = null;
		String shape = null;
		do {
			System.out.println("Enter the shape");
			shape = IShape.scan.next();
			IShape obj = ShapeFactory.getShape(shape);
			obj.readData();
			System.out.println(obj.calcVolume());
			System.out.println(obj.getClass().getSimpleName());
			System.out.println("press y to continue");
			opt = IShape.scan.next();
		} while (opt.equals("y"));
	}

}
