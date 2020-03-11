package com.basic.opps;

public class Test {

	String name;
	int rollno;

	Test(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) {

		Test obj = new Test("Anil", 101);
		System.out.println(obj.name + " " + obj.rollno);
	}

}
