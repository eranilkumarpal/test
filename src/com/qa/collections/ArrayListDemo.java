package com.qa.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrayListDemo {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("Anil");
		list.add("Amar");
		list.add("Suman");
		list.add("Anwesha");
		list.add("Anamika");
		System.out.println(list);
		HashSet set = new HashSet(list);
		System.out.println(set);
		LinkedHashSet linkedHashSet = new LinkedHashSet(list);
		System.out.println(linkedHashSet);
		TreeSet treeSet = new TreeSet(list);
		System.out.println(treeSet);

	}

}
