package com.basic.programs;

public class StringFormatter {
	public static String formatterMethod(String str) {
		StringBuffer sb = new StringBuffer(str);
		sb.reverse();
		return sb.toString();
	}

}
