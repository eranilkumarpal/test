package com.interview.questions;

public class SortedSquareArray {
	static int[] sqrtSortedArray(int[] inputArray) {

		int[] result = new int[inputArray.length];
		int left = 0;
		int right = inputArray.length - 1;
		for (int i = inputArray.length - 1; i >= 0; i--) {
			if (Math.abs(inputArray[left]) > inputArray[right]) {

				result[i] = inputArray[left] * inputArray[left];
				left++;
			} else {
				result[i] = inputArray[right] * inputArray[right];
				right--;
			}

		}

		return result;

	}
}
