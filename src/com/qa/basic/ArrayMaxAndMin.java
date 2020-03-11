package com.qa.basic;

public class ArrayMaxAndMin {

	public static void main(String[] args) {

		int arr[] = {0, 2, 3, 4, 5, -6 };

		int max = getMax(arr);
		System.out.println(max);
		int min = getMin(arr);
		System.out.println(min);
	}

	public static int getMax(int[] inputArray) {
		int maxvalue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxvalue) {
				maxvalue = inputArray[i];
			}

		}
		return maxvalue;
	}

	public static int getMin(int[] inputArray) {

		int minvalue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minvalue) {
				minvalue = inputArray[i];
			}
		}

		return minvalue;
	}
}
