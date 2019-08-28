package com.sg.demos;

public class SleepDemo {
	static long sum;

	public static void main(String args[]) throws InterruptedException {

		SumThread sum = new SumThread();
		sum.setName("SumThread");
		sum.start();
		sum.join();
		AvgThread avg = new AvgThread();
		avg.setName("AvgThread");
		avg.start();

	}

}

class SumThread extends Thread {

	@Override
	public void run() {
		long tmp = 0;
		for (int i = 0; i < 10000; i++) {
			tmp += i * i;
			System.out.println(Thread.currentThread().getName() + " " + i);
		}

		SleepDemo.sum = tmp;
	}

}

class AvgThread extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		System.out.println(SleepDemo.sum / 1000.0);
	}

}