package com.sg.client;

import com.sg.beans.Sales;

public class SalesClient {
	public static void main(String[] args) {
		Sales s1 = new Sales("vinod", 20000);
		Sales s2 = new Sales("Sandeep", 120000);
		Sales s3 = new Sales("Shyam", 220000);

		System.out.println("Count : " + Sales.count);
		System.out.println("Sales : " + Sales.tsales);

	}

}
