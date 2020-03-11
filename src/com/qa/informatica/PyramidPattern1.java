package com.qa.informatica;

public class PyramidPattern1 {

	public static void main(String[] args) {
		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k < i * 2; k++) {
				System.out.print("*");
			}

			System.out.println();

		}

	}

}