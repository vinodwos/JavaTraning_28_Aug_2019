package com.sg.dao;

import java.util.ResourceBundle;

public class DaoFactory {
	public static IEmpDao getDao() {
		IEmpDao dao = null;
		ResourceBundle.clearCache();
		ResourceBundle rb = ResourceBundle.getBundle("sg");
		String clsName = rb.getString("cname");
		try {
			Class cls = Class.forName(clsName);
			dao = (IEmpDao) cls.newInstance();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return dao;
	}
}
