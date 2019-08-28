package com.sg.beans;

import javax.xml.bind.ValidationException;

public class Emp {
	private int eid;
	private String ename;
	private double sal;
	private double pf;
	private double netSel;
	private double da;

	public int getEid() throws ValidationException {
		if (eid < 1000)
			throw new ValidationException("Id must be min 4 digits");
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getPf() {
		return pf;
	}

	public double getNetSel() {
		return netSel;
	}

}
