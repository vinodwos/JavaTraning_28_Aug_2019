package com.sg.service;

public class Contract extends Emp {

	private int days;

	public Contract(int eid, String ename, double sal, int days) {
		super(eid, ename, sal);
		this.days = days;
	}

	@Override
	public double calcSel() {
		return getSal() * days;
	}

	@Override
	public void display() {
		super.display();
		String etype = getClass().getSimpleName();
		System.out.printf("%10s%10s%10d%20.2f%10s\n", "NA", "NA", days, calcSel(), etype);
	}

}
