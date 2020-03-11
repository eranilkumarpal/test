package com.functionalinterface;

interface Interff {

	public int square(int n);
}

public class Test1 {

	public static void main(String[] args) {

		Interff ii = (n) -> {
			return n * n;
		};
		System.out.println("The square value is :" + ii.square(5));

	}

}
