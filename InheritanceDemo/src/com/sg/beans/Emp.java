package com.sg.beans;

public class Emp {
	private int eid;
	private String ename;

	public Emp(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}

	@Override
	public String toString() {
		return eid + " " + ename;
	}

	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this==emp)
			return true;
		if (this.eid == emp.eid)
			return true;
		else
			return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(eid + " instance is GCed");
	}
	
	

}
