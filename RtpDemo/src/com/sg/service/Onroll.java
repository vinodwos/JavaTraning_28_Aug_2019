package com.sg.service;

public class Onroll extends Emp {

	private double pf;
	private double da;

	public Onroll(int eid, String ename, double sal) {
		super(eid, ename, sal);
		this.pf = getSal() * 0.12;
		this.da = getSal() * 0.4;
	}

	@Override
	public double calcSel() {
		return getSal() + da - pf;
	}

	@Override
	public void display() {
		super.display();
		String etype = getClass().getSimpleName();
		System.out.printf("%10.2f%10.2f%10s%20.2f%10s\n", da, pf, "NA", calcSel(), etype);
	}

}
