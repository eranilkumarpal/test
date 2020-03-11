package com.interview.questions;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		Integer a1[] = { 1, 2, 3 };// Array1
		Integer a2[] = { 1, 2, 3, 4 };// Array2
		Integer a3[] = { 1, 2, 3, 4, 5 };// Array3

		Integer a[][] = { a1, a2, a3 };// Jagged Array
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				System.out.print(a[i][j] + " ");
			}
			System.out.print("\n");
		}

	}

}
