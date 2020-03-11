package com.basic.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		Pattern p = Pattern.compile("a?");
		Matcher m = p.matcher("abaabaaab");
		while (m.find()) {
			System.out.println(m.start() + "...." + m.end() + "...." + m.group());
		}

	}

}
