package com.sg.client;

import com.sg.service.Flyable;

public class LambdaClient {
	public static void main(String args[]) {
		process(()->System.out.println("eagal"));
		process(()->System.out.println("eagal"));
		
	}
	
	public static void process(Flyable fly) {
		fly.Fly();
	}

}
