package com.qa.basic;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		System.out.println(reverse("anil"));

	}

	public static String reverse(String str) {
		if(str.length()<=1)
			return str;
		else
			return reverse(str.substring(1,str.length()))+str.charAt(0);
		
		

	}

}
