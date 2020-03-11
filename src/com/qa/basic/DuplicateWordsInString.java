package com.qa.basic;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsInString {

	public static void main(String[] args) {

		// Hay,I am java lover and java is my favorite language java
		// java:3

		findDuplicateString("Hey java is java langugae java lover");
		findDuplicateString("Hey python is python langugae python lover");

	}

	static void findDuplicateString(String inputString) {

		// split:
		String words[] = inputString.split(" ");
		// create hashmap
		HashMap<String, Integer> wordcount = new HashMap<String, Integer>();
		// to check each words in the array

		for (String word : words) {
			if (wordcount.containsKey(word)) {

				wordcount.put(word, wordcount.get(word) + 1);
			} else {
				wordcount.put(word, 1);
			}

		}

		// extracting the words from set

		Set<String> wordsInString = wordcount.keySet();
		for (String word : wordsInString) {
			if (wordcount.get(word) > 1) {
				System.out.println(word + " : " + wordcount.get(word));
			}

		}

	}

}
