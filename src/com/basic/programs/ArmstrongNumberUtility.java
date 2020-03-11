package com.basic.programs;

import java.util.Scanner;

public class ArmstrongNumberUtility {

	public static void main(String[] args) {
		int i = 100, arm;
		System.out.println("Armstrong numbers between 100 to 999");
		while (i < 1000) {
			arm = armstrongNumber(i);
			if (arm == i) {

				System.out.println(i);
				i++;
			}

		}

	}

	static int armstrongNumber(int num) {
		int i, r = 0;

		while (num != 0) {
			i = num % 10;
			r = r + (i * i * i);
			num /= 10;

		}
		return r;
	}
}
