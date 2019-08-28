package com.sg.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sg.beans.Emp;
import com.sg.execptions.IDException;


public interface IEmpService {
    Map<Integer, Emp> map = new HashMap<>();//public static final map
    
	int addEmployee(Emp emp)throws IDException;
	int removeEmployee(int eid)throws IDException;
	List<Emp> viewEmployee();
	List<Emp> viewEmployee(double minSal, double maxSal);
	Emp viewEmployee(int eid)throws IDException;
}
