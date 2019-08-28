package com.sg.client;

import com.sg.service.Flyable;
import com.sg.service.ICalc;

public class LambdaClient2 {
	public static void main(String args[]) {

		int v1 = 10, v2 = 5;

		process((a, b) -> {
			return a + b;
		}, v1, v2);
		process((a, b) -> {
			return a - b;
		}, v1, v2);
		process((a, b) -> {
			return a * b;
		}, v1, v2);
		process((a, b) -> {
			return a / b;
		}, v1, v2);

		// process(()->System.out.println("eagal"));
		// process(()->System.out.println("eagal"));
		//
	}

	public static void process(ICalc obj, int a, int b) {
		System.out.println(obj.calculate(a, b));
	}
}
