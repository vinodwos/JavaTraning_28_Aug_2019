package com.sg.client;

import com.sg.service.Admin;
import com.sg.service.Atm;
import com.sg.service.Bank;

public class BankClient {

	public static void main(String[] args) {
		Admin admin = Bank.getAdmin();
		admin.clearPdc();

		Atm atm = Bank.getAtm();
		atm.getBalance();
		atm.withdraw();
	}

}
