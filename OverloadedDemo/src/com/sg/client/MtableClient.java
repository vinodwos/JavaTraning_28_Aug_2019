package com.sg.client;

import com.sg.beans.Mtable;

public class MtableClient {

	public static void main(String[] args) {
		try {
			Mtable obj = new Mtable(5);
			obj.display();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
