package com.collection1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("Anil", 101);
		m.put("Amit", 102);
		m.put("Abhimanu", 103);
		m.put("Anshul", 104);
		System.out.println(m);
		System.out.println(m.put("Suman", 105));
		// System.out.println(m);
		Set s = m.keySet();
		System.out.println(s);
		Collection c = m.values();
		System.out.println(c);
		Set s1 = m.entrySet();
		System.out.println(s1);
		Iterator it = s1.iterator();
		while (it.hasNext()) {
			Map.Entry m1 = (Map.Entry) it.next();
			System.out.println(m1.getKey() + "-----" + m1.getValue());
			if (m1.getKey().equals("Suman")) {
				m1.setValue(104);
			}
		}
		System.out.println(m);
	}

}
