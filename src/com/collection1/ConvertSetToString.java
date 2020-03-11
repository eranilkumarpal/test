package com.collection1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ConvertSetToString {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(Arrays.asList("Geeks", "ForGeeks", "GeeksForGeeks"));
		System.out.println("Print the set :" + set);
		String str = String.join(",", set);
		System.out.println("Comma separted string :" + str);
		//List<String> al=set.stream().collect(Collectors.toList());
		//System.out.println(al);
		

	}

}
