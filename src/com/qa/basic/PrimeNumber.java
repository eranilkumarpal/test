package com.qa.basic;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num = sc.nextInt();
		System.out.println("Prime number between 1 and " + num);
		// loop through check number one by one 
		for (int i = 1; i <= 10; i++) {
			boolean isPrime = true;
			// check through loop number is prime or not
			for (int j = 2; j < i; j++) {
					if (i % j == 0) {
					isPrime = false;
					//System.out.println(i+"non prime");
					break;
				}
			}
			if(isPrime)
				System.out.println(i+" ");

		}

	}

}
