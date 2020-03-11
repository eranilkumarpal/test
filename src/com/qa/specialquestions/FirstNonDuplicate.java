package com.qa.specialquestions;

import java.util.Stack;

public class FirstNonDuplicate {

	public static void main(String[] args) {
		String str = "efficiency";

		char[] ch = str.toCharArray();
		Stack<Character> st = new Stack<Character>();
		Stack<Character> st1 = new Stack<Character>();
		for (int i = 0; i < ch.length - 1; i++) {
			for (int j = i + 1; i < ch.length - 1; j++) {
				if (ch[i] == ch[j]) {
					st.push(ch[i]);

				}
			}
		}

		for (int i = 0; i < ch.length; i++) {

			if (!(st.contains(ch[i]))) {

				st1.push(ch[i]);

			}
		}
		System.out.println(st1);
	}

}
