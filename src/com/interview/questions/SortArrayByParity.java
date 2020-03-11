package com.interview.questions;

public class SortArrayByParity {

	public static int[] sortArrayByParity(int[] arr) {

		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				int temp = arr[index];
				arr[index++] = arr[i];
				arr[i] = temp;
			}
		}
		return arr;
	}

}
