package com.qa.basic;



class Parent {
	
	static int x=10;
	int y=5;

	String s = "Parent variable";
	public static void m5()
	{
		System.out.println("static method under Parent class");
	}
	public void m2()
	{
		int x=30;
		int y=20;
		System.out.println(x);
		System.out.println(y);
		System.out.println(s); 
		
	}

}

class Child extends Parent {

	String s = "Child variable";
	
	public static void m3()
	{
		System.out.println("static method under child class");
	}

	public void m1() {
		//System.out.println(this.s);
		System.out.println(s);
		System.out.println(super.s);
		System.out.println(x);
		System.out.println(y);
	}

}

public class MyClass {

	public static void main(String[] args) {

		Child c = new Child();
		System.out.println(c.s);
		System.out.println(c.x);
		System.out.println(c.y);
		c.m1();
		c.m2();
		Child.m3();
		m4();
		Child.m5();
		Parent.m5();
	}
	
	
	public static void m4()
	
	{
		System.out.println("static methods under main MyClass");
	}

}
