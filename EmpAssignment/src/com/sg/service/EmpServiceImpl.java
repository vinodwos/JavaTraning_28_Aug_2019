package com.sg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.bind.ValidationException;

import com.sg.beans.Emp;
import com.sg.execptions.IDException;

public class EmpServiceImpl implements IEmpService {

	@Override
	public int addEmployee(Emp emp) throws IDException {
		try {
			if (map.containsKey(emp.getEid()))
				throw new IDException("ID already exists");
			map.put(emp.getEid(), emp);
		} catch (ValidationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return 1;
	}

	@Override
	public int removeEmployee(int eid) throws IDException {
		if (!map.containsKey(eid))
			throw new IDException("ID not found");
		map.remove(eid);
		return 1;
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = new ArrayList<>(map.values());
		return lst;
	}

	@Override
	public List<Emp> viewEmployee(double minSal, double maxSal) {
		List<Emp> lst = new ArrayList<>(map.values());
		List<Emp> elist = lst.stream().filter(e -> e.getSal() >= minSal && e.getSal() <= maxSal)
				.collect(Collectors.toList());
		return elist;
	}

	@Override
	public Emp viewEmployee(int eid) throws IDException {
		if (!map.containsKey(eid))
			throw new IDException("ID not found");
		Emp emp = map.get(eid);
		return emp;
	}

}
