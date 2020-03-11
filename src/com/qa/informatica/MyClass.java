package com.qa.informatica;

class AA {

	public void print() {
		System.out.println("abc");
	}
}

class BB extends AA {
	public void print() {
		System.out.println("def");
	}
}

public class MyClass {

	public static void main(String[] args) {

		AA a1 = new AA();
		AA a2 = new BB();
		BB b1 = new BB();
		// BB b2 = (BB) new AA();//no
		a1.print();// abc
		a2.print();// abc
		b1.print();//

	}

}
