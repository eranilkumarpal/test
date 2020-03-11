package com.qa.specialquestions;

public class SmartSwapping {

	public static void main(String[] args) {

		int numX = 10;
		int numY = 20;
		System.out.println("-----Before swapping-----");
		System.out.println("-----numX :" + numX);
		System.out.println("-----numY :" + numY);
		numX = numX + numY;
		numY = numX - numY;
		numX = numX - numY;
		System.out.println("-----Aftre swapping-----");
		System.out.println("-----numX :" + numX);
		System.out.println("-----numY :" + numY);

	}

}
