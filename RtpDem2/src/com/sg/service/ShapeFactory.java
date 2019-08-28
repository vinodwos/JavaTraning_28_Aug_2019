package com.sg.service;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
	private static Map<String, IShape> map = new HashMap<>();
	static {
		map.put("cone",	new Cone());
		map.put("cyl",	new Cylinder());
		map.put("sp",	new Sphere());
		
	}
	
	
	public static IShape getShape(String str) {
		IShape obj = map.get(str);
		return obj;
	}
}
