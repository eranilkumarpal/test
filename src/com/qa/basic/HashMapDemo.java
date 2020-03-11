package com.qa.basic;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {

		Map map = new HashMap();
		map.put("001", "Anil");
		map.put("002", "Amit");
		map.put("003", "Amar");
		map.put("004", "Amir");
		map.put("005", "Aman");
		map.put("006", "Arun");
		map.put("007", "Anik");
		map.put("008", "Anna");
		map.put("009", "Ahna");
		map.put("010", "Aish");
		map.put("011", "Ashu");
		System.out.println(map);
		Set keys = map.keySet();
		System.out.println(keys);
		Collection s = map.values();
		System.out.println(s);

		Set enSet = map.entrySet();
		System.out.println(enSet);

		Iterator it = enSet.iterator();
		while (it.hasNext()) {
			Map.Entry m1 = (Map.Entry) it.next();
			System.out.println(m1.getKey());
			System.out.println(m1.getValue());
		}

	}
}
