package com.sg.client;

import com.sg.service.Emp;

public class EmpClient {
	public static void main(String args[]) {
		Emp emp = new Emp();
		emp.setEid(10);
		emp.setEname("Vinod Kumar");
		emp.setAge(20);
		emp.setSal(10000);
	}
}
