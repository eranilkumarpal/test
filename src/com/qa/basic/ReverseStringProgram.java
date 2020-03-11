package com.qa.basic;

public class ReverseStringProgram {

	public static void main(String[] args) {
		String reverse = "";
		String inputString = "anil";
		char[] chars = inputString.toCharArray();
		System.out.println(chars.length);
		int length = chars.length;
		for (int i = length - 1; i >= 0; i--) {
			System.out.print(chars[i]);

		}
		System.out.println("\n ---------------------------------");

		for (int i = length - 1; i >= 0; i--) {

			reverse = reverse + inputString.charAt(i);
		}
		System.out.println("Reverse string is:" + reverse);

		System.out.println("\n ---------------------------------");

		StringBuffer stringBuffer = new StringBuffer(inputString);
		System.out.println(stringBuffer.reverse());

		System.out.println("\n ---------------------------------");

		StringBuilder stringBuilder = new StringBuilder(inputString);
		System.out.println(stringBuilder.reverse());

	}

}
