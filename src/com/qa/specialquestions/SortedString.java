package com.qa.specialquestions;

import java.util.Arrays;

public class SortedString {

	public static void main(String[] args) {

		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "aug", "Sep", "Oct", "nov", "Dec" };
		System.out.println("------Before sorted list---------");
		showList(inputList);
		Arrays.sort(inputList);
		System.out.println("\n------After sorted list---------");
		showList(inputList);

		// Call to sort the input list in case-sensitive order.
		System.out.println("\n-------Sorted list (Case-Sensitive)-------");
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);

		// Display the sorted list.
		showList(inputList);
	}

	public static void showList(String[] array) {
		for (String arr : array) {
			System.out.print(arr + " ");
		}
		System.out.println();
	}

}
