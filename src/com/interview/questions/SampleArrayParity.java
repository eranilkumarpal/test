package com.interview.questions;

public class SampleArrayParity {

	public static void main(String[] args) {

		int[] arr = {3,1,2,4};
		int[] array = SortArrayByParity.sortArrayByParity(arr);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
