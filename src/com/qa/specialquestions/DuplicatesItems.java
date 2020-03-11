package com.qa.specialquestions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicatesItems {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {

			list.add(String.valueOf(i));
		}
		// Insert a new set of numbers from 0-5.
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("Input values :" + list);
		System.out.println("\nFilter values :" + processList(list));

	}

	public static Set<String> processList(List<String> listContainingDuplicates) {

		final Set<String> resultSet = new HashSet<String>();
		final Set<String> tempSet = new HashSet<String>();
		for (String yourInt : listContainingDuplicates) {
			if (!tempSet.add(yourInt)) // all values accept dup will go inside
			{

				resultSet.add(yourInt);
			}

		}
		System.out.println("temset :" + tempSet);
		return resultSet;
	}
}
