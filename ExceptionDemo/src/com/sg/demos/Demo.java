package com.sg.demos;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String res = approveLoan(20, 600000);
		System.out.println(res);

	}

	public static String approveLoan(int age, double income) {
		String res = null;
		try {
			res = processLoan(age, income);
			return res;
		} catch (AgeException | IncomeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			res = e.getMessage();
			return res;
		} finally {
			System.out.println("I am in a finally block");
		}
	}

	public static String processLoan(int age, double income) throws AgeException, IncomeException {
		if (age < 20 || age > 50)
			throw new AgeException("Age must be between 20 & 50");

		if (income < 400000)
			throw new IncomeException("Income must be greater than 400000");
		return "approved";
	}

}
