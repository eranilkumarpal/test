package com.qa.basic;

import java.util.Scanner;

public class PrintNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

	}

}
