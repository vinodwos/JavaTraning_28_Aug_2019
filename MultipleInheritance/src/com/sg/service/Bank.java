package com.sg.service;

public class Bank implements Atm, Admin {

	private static Bank bank = new Bank();

	private Bank() {

	}

	public static Atm getAtm() {
		Atm atm = bank;
		return atm;
	}

	public static Admin getAdmin() {
		Admin admin = bank;
		return admin;
	}

	@Override
	public void clearPdc() {
		System.out.println("clear pdc");
	}

	@Override
	public void withdraw() {
		System.out.println("withdraw");
	}

	@Override
	public void getBalance() {
		System.out.println("get bal");
	}

}
