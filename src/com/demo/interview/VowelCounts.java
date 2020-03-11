package com.demo.interview;

import java.util.Scanner;

public class VowelCounts {

	public static void main(String[] args) {

		String str = "selenium is easy language to automate";
		int count = 0;

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the string :");
		// str = sc.nextLine();
		for (int i = 0; i < str.length(); i++) {

			switch (str.charAt(i)) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
			}

		}

		System.out.println("number of vowels :" + count);
	}

}
