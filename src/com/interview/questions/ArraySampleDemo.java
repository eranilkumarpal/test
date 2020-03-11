package com.interview.questions;

public class ArraySampleDemo {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 55 };
		disp(arr);
		int[] reverseArr;
		reverseArr = reverseArray(arr);
		System.out.println("reverse array is listing :");
		disp(reverseArr);

	}

	public static void disp(int[] input) {
		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);

		}

	}

	public static int[] reverseArray(int[] input) {
		int[] reverse = new int[input.length];
		for (int i = 0, j = reverse.length - 1; i < input.length; i++, j--) {
			reverse[j] = input[i];

		}
		return reverse;

	}
}
