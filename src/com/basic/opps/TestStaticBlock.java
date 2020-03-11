package com.basic.opps;

public class TestStaticBlock {
	static TestStaticBlock x = null;
	static {
		TestStaticBlock.x = new TestStaticBlock();
		System.out.println(TestStaticBlock.x);
	}

	public static void main(String[] args) {

		System.out.println(TestStaticBlock.x);

	}

}
