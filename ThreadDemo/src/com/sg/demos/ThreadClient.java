package com.sg.demos;

public class ThreadClient {
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();

		t1.setName("vinod");
		t2.setName("rajno");

		t1.start();
		t2.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));

		}
	}
}
