package com.basic.programs;

public class PalindromeDemo {

	public static void main(String[] args) {
		int r, tmp, num = 0;
		int n = 454;
		tmp = n;
		while (n > 0) {
			r = n % 10;
			num = num * 10 + r;
			n = n / 10;

		}
		if (tmp == num) {
			System.out.println("No is palindrome");
		} else {
			System.out.println("No is not palindrome");
		}

	}

}
