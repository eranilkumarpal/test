package com.qa.specialquestions;

public class FindMaxTwoValues {

	public static void main(String[] args) {
		int[] list = { -10, 3, 5, 9, 30, 8, -22 };
		FindMaxTwoValues max = new FindMaxTwoValues();
		max.maxtwoValues(list);

	}

	public void maxtwoValues(int[] nums) {

		int maxOne = 0;
		int maxTwo = 0;
		for (int n : nums) {
			if (maxOne < n) {
				maxTwo = maxOne;
				maxOne = n;
			} else if (maxTwo < n) {
				maxTwo = n;
			}

		}
		System.out.println("Max1 : " + maxOne);
		System.out.println("Max2 : " + maxTwo);

	}

}
