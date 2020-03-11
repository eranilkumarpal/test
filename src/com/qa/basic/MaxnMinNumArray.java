package com.qa.basic;

import java.util.Arrays;

public class MaxnMinNumArray {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 40, 60 };
		int maxNumber = max(array);
		System.out.println("Max Number is :"+maxNumber);
		
		int minNumber = min(array);
		System.out.println("Min Number is :"+minNumber);


	}

	public static int max(int[] numbers) {
//		if (numbers == null || numbers.length == 0) {
//			throw new IllegalArgumentException("Invalid input:" + Arrays.toString(numbers));
//		}
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
			}
		}
		return max;
	}

	public static int min(int[] numbers) {
//		if (numbers == null || numbers.length == 0) {
//			throw new IllegalArgumentException("Invalid input:" + Arrays.toString(numbers));
//		}
		int min = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] < min) {
				min = numbers[i];
			}
		}
		return min;
	}
}
