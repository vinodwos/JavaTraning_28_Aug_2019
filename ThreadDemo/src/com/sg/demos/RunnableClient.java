package com.sg.demos;

public class RunnableClient {
	public static void main(String[] args) {
		MyRunnable r1 = new MyRunnable();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r1);

		t1.setName("vinod");
		t2.setName("rajno");

		t1.start();
		t2.start();

		for (int i = 0; i < 1000; i++) {
			System.out.println(Thread.currentThread().getName() + " " + (i * 5));

		}
	}
}
