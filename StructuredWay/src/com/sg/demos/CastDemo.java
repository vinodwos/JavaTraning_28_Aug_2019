package com.sg.demos;

public class CastDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new B();
//		C b = (C)a;//downcasting - error Class cast exception since B cannot be cast to C
		
		Object o = a; //upcasting
		
		A a1 = (A)o;
		
		C c1 = (C)o;
		
		
	}

}


class A {}

class B extends A{}
class C extends B{} 
