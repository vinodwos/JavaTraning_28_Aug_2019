package com.sg.client;

import com.sg.beans.Nokia1100;
import com.sg.beans.NokiaLumia;

public class NokiaClient {

	public static void main(String[] args) {
		Nokia1100 obj = new NokiaLumia();
		obj.doConverse();
		obj.sendSms();
//		obj.browseNet();
	}

}
