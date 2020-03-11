package com.qa.basic;

public class TestClass {

	public static void main(String[] args) {
		String test = "TD,1;TE,2;TD,;TF-0)";
		String rev = "";
		// String[] str = test.split("");
		test = test.replaceAll("[^A-Z]", "");

		System.out.println(test.length());
		for (int i = test.length() - 1; i >= 0; i--) {
			rev = rev + test.charAt(i);

		}
		System.out.println(rev);

	}

}
