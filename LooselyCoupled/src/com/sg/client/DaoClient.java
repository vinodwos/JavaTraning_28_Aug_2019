package com.sg.client;

import java.util.Scanner;

import com.sg.dao.DaoFactory;
import com.sg.dao.IEmpDao;

public class DaoClient {

	public static void main(String[] args) {
		String opt=null;
		Scanner scan = new Scanner(System.in);
		do {
			IEmpDao dao = DaoFactory.getDao();
			dao.display();
			System.out.println("press y to continue");
			opt = scan.next();
		}while(opt.equals("y"));
		scan.close();
	}

}
