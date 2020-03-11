package com.qa.testcase;

abstract class P {

	abstract public void m3();

	public void m1() {

		System.out.println("Parent method is m1 function");
	}
}

class C extends P {
	public void m3() {
		System.out.println("This is inheritated m3 function");

	}

	public void m2() {
		System.out.println("Child method is m2 function");
	}
}

public class MyTestClass {

	public static void main(String[] args) {
		P p = new C();
		p.m1();
		p.m3();
		C c = new C();
		c.m2();

	}

}
