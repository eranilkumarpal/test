package com.qa.basic;

import java.util.HashMap;
import java.util.Set;

public class PatternDemoAlabhbet {
	public static void main(String[] args) {
		String inputStr = "aaabbcccdda";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		char[] strArr = inputStr.toCharArray();
		for (Character c : strArr) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		
		Set<Character> keys = map.keySet();
		for (Character ch : keys) {
			if (map.get(ch) > 1) {
				
				System.out.print(ch + "" + map.get(ch));
			}
		}

	}
}
