package com.qa.informatica;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharCount {

	public static void main(String[] args) {
		String s = "Bitter Butter";

		Map<Character, Integer> map = new HashMap<>();
		char[] ch = s.toCharArray();
		for (Character c : ch) {
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
		}
		Set<Character> keys = map.keySet();
		for (Character ch1 : keys) {
			if (map.get(ch1) > 1) {
				System.out.print(ch1 + "" + map.get(ch1));
			}
		}

	}

}
