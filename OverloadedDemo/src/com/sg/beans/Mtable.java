package com.sg.beans;

public class Mtable {
	private int num;

	public Mtable(int num) throws Exception {
		super();
		if (num <= 0)
			throw new Exception("Number must be greater than Zero");
		this.num = num;
	}

	public void display() {
		for (int i = 0; i <= 10; i++) {
			System.out.printf("%d * %d = %d\n", num, i, (num * i));
		}
	}

}
