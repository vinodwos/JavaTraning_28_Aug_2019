package com.sg.client;

import java.util.ArrayList;
import java.util.List;

import com.sg.service.Contract;
import com.sg.service.Emp;
import com.sg.service.Onroll;

public class EmpClient {
	public static void main(String[] args) {
		List<Emp> lst = new ArrayList();
		lst.add(new Onroll(1001, "Vinod", 20000));
		lst.add(new Onroll(1002, "Chunnu", 120000));
		lst.add(new Contract(100, "Rajni", 10000, 12));
		lst.add(new Contract(1001, "Pawan", 320000, 10));
		generateReport(lst);

	}

	public static void generateReport(List<Emp> lst) {
		System.out.println(
				"__________________________________________________________________________________________________________\n");
		System.out.printf("%10s%20s%10s%10s%10s%10s%20s%10s\n", "EID", "ENAME", "SAL", "DA", "PF", "DAYS", "NET SELL",
				"ETYPE");
		System.out.println(
				"__________________________________________________________________________________________________________\n");

		for (Emp e : lst) {
			display(e);
		}
		System.out.println(
				"__________________________________________________________________________________________________________\n");

	}

	public static void display(Emp emp) {
		emp.display();
	}
}
