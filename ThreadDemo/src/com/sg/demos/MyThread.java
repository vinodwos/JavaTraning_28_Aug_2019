package com.sg.demos;

public class MyThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));

		}
	}

}
