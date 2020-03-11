package com.interview.questions;

public class SortedSquareDemo {

	public static void main(String[] args) {
		int inputArr[] = { 1, 2, 4 };

		int reverseArr[];
		reverseArr = SortedSquareArray.sqrtSortedArray(inputArr);

		for (int y : reverseArr) {
			System.out.println(y);

		}

	}

}
