package com.basic.programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		int count = 0;
		Pattern p = Pattern.compile("[^a-z0-9]");
		Matcher m = p.matcher("a3b#k@9z");
		while (m.find()) {
			count++;
			System.out.println(m.start() + "...." + m.end() + "...." + m.group());
		}
		System.out.println("no of occurences.." + count);

	}

}
