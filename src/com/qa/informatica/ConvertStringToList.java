package com.qa.informatica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertStringToList {

	public static void main(String[] args) {
		String st = "'a','b','v','r','t','y'";
		String[] str = st.split(",");
		List<String> al = new ArrayList<String>();

		al = Arrays.asList(str);
		for (String s : al) {
			System.out.println(s);
		}
	}

}
