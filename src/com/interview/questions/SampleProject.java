package com.interview.questions;

public class SampleProject {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = "fsafgfAhjhhNjkjjkIhhkkkkjkLjkkkahkKhjhhjUjjkMjkjkjAjkjkRhjhjPhhAhjhhLjk";
		String st = str.replaceAll("[A-Z]", "") + str.replaceAll("[^A-Z]", "");
		System.out.println(st);
		String st1 = str1.replaceAll("[^A-Z]", "");
		System.out.println(st1);

		// String str1 = str.substring(1, 5);
		// System.out.println(str1);
		// String str2 = str.substring(7, 11);
		// System.out.println(str2);
		// System.out.println(str1 + " " + str2);

	}

}
