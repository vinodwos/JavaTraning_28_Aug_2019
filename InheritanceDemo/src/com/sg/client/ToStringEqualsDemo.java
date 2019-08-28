package com.sg.client;

import com.sg.beans.Emp;

public class ToStringEqualsDemo {

	public static void main(String[] args) {
		Emp e1 = new Emp(1001, "Vinod");
		Emp e2 = new Emp(1001, "Vinod");
		System.out.println(e1);
		System.out.println(e1 == e2);
		System.out.println(e1.equals(e2));

	}

}
