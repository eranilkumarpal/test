package com.demo.interview;

import java.util.Scanner;

public class VowelsCount {

	void vowels(String str) {
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				
				System.out.println(ch);
				
			}
			

		}
	

	}

	public static void main(String[] args) {

		VowelsCount v = new VowelsCount();
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		s = sc.nextLine();
		System.out.println("Vowels in a string are :");
		v.vowels(s);

	}

}
