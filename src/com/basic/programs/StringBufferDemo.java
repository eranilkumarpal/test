package com.basic.programs;

public class StringBufferDemo {

	public static void main(String[] args) {
		String str = "anilkumar";
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse string is :" + sb.reverse());
		StringBuilder sb1 = new StringBuilder(str);
		System.out.println("Reverse string is :" + sb1.reverse());

	}

}
