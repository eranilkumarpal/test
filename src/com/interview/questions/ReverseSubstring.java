package com.interview.questions;

public class ReverseSubstring {

	public static void main(String[] args) {
		String s = "Selenium";
		StringBuffer sb = new StringBuffer();
		StringBuffer sbRev = new StringBuffer(s.substring(1, s.length() - 1));
		System.out.println(sbRev);
		sb.append(s.charAt(0));
		sb.append(sbRev.reverse());
		sb.append(s.charAt(s.length() - 1));
		System.out.println(sb);

	}

}
