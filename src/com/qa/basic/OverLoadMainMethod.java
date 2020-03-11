package com.qa.basic;

public class OverLoadMainMethod {

	public static void main(String[] args) {

		System.out.println("This is main method");
		main("String args");
		main(10);
		main(10, 20);
		main("anil", 10);
	}

	public static void main(String args) {
		System.out.println("This is args main method");
	}

	public static void main(int a) {
		System.out.println("This is a main method");
	}

	public static void main(int a, int b) {
		System.out.println("This is a and b main method");
	}

	public static void main(String x, int y) {
		System.out.println("This is x str y int main method");
	}
}
