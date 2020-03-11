package com.qa.basic;

import java.util.HashSet;
import java.util.Set;

public class DplicateArrayElement {

	public static void main(String[] args) {
		String names[] = { "java", "C#", "PHP", "java", "NodeJs", "C++" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i].equals(names[j]))
					System.out.println("Duplicate values is :::" + names[i]);

			}
		}
		System.out.println("***********************************");
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("Duplicate values is :::" + name);
			}

		}
	}

}
