package com.demo.interview;

public class SampleDemoPrg {

	public static void main(String[] args) {
		String str = "humlogkhusgjjdksjkf";
		char ch;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.println(ch);
				count++;
			}

		}
		System.out.println(count);

	}

}
