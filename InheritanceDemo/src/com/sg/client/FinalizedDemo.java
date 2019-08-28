package com.sg.client;

import java.util.Scanner;

import com.sg.beans.Emp;

public class FinalizedDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "Vinod");
		Emp e2 = new Emp(1002, "Rajni");
		Emp e3 = new Emp(1002, "Rajni");
		e1 = null;
		e2 = null;
		System.gc();
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
	}

}
