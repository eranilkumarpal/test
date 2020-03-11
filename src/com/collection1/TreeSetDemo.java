package com.collection1;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet t = new TreeSet();//comparable 
		t.add("A");
		t.add("a");
		t.add("b");
		t.add("z");
		t.add("D");
		t.add("Y");
		//t.add(new StringBuffer("G"));
		//t.add(new Integer(10));
		//t.add(null);
		System.out.println(t);
		
	}

}
