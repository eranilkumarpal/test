package com.basic.opps;

public class PrimitiveToObject {

	public static void main(String[] args) {
		byte x = 100;
		Byte y = Byte.valueOf(x);//boxing

		System.out.println(y);
		byte x1 = 100;
		Byte y1 = new Byte(x1);//boxing
		System.out.println(y1);

	}

}
