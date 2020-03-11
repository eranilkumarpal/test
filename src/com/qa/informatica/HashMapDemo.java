package com.qa.informatica;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		String s = "aaabbbcccdef";
		char[] ch = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
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
