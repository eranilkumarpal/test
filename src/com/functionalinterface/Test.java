package com.functionalinterface;

interface Interf {
	public void m1(int a, int b);

}

class Test {
	public static void main(String[] args)

	{
		Interf i = (a, b) -> System.out.println("The Sum :" + (a + b));
		i.m1(10, 20);
		i.m1(30, 40);
		i.m1(35, 15);
	}
}
