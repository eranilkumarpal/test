package com.basic.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("ba");
		Matcher m = p.matcher("abbabbabbbbbbbb");
		while (m.find()) {
			count++;
			System.out.println(m.start() + "..." + m.end() + "..." + m.group());

		}
		System.out.println("no of occurences" + count);
	}

}
