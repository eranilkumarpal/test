package com.interview.questions;

public class PluseOnePattern {

	public static void main(String[] args) {

		int[] plusOneInteger = { 1, 2, 9 };
		int[] output = PlusOne.pluseOne(plusOneInteger);
		for (int y : output) {
			System.out.print(y + " ");
		}

	}

}
