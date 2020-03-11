package com.collection1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class CollectionDemo {

	public static void main(String[] args) {
		List<String> aList = Arrays.asList("Suman", "Anil", "Amar", "Anwesha", "Jyoti", "Alu");
		Set<String> aSet = new HashSet<String>(aList);
		System.out.println("Created HashSet is");
		for (String x : aSet)
			System.out.println(x);

		System.out.println("Created TreeSet is");
		Set<String> tSet = new TreeSet<String>(aList);
		System.out.println("Created TreeSet is");
		for (String x : tSet)
			System.out.println(x);
		System.out.println("Created LinkedHashSet is");
		Set<String> tLinkedHashSet = new LinkedHashSet<String>(aList);
		for (String x : tLinkedHashSet)
			System.out.println(x);
		Set<String> set = aList.stream().collect(Collectors.toSet());
		System.out.println("-----");
		for (String x : set)

			System.out.println(x);

	}

}
