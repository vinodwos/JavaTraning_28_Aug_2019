package com.sg.demos;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t1 = Test.getTestInstance();
		Test t2 = Test.getTestInstance();
		Test t3 = Test.getTestInstance();
		Test t4 = Test.getTestInstance();
//		System.out.print(Test.INFO);
	}

}

class Test {
	public static Test t = null;

	private Test() {
		System.out.println("Private Test Constructor called");
	}

	public static Test getTestInstance() {
//		if (t == null) {
			t = new Test();

//		}
		return t;
	}
}
