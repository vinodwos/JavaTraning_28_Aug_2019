package com.sg.client;

import com.sg.service.Flyable;

public class AnonyClient {
	public static void main(String args[]) {
		Flyable fly1 = new Flyable() {

			@Override
			public void Fly() {
				System.out.println("eagal");

			}
		};

		Flyable fly2 = new Flyable() {

			@Override
			public void Fly() {
				System.out.println("flight");

			}
		};

		fly1.Fly();
		fly2.Fly();
	}
}
