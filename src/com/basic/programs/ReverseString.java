package com.basic.programs;

public class ReverseString {

	public static void main(String[] args) {

		String rev = "";
		String str = "anilkumar";
		int length = str.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("Reverse string is:" + rev);
	}

}
