package com.qa.informatica;

public class ReversePyramid {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 7; k > (i * 2); k--) {
				System.out.print("*");
			}
			// for (int l = 3; l >= i; l--) {
			// System.out.print("*");
			// }
			System.out.println();

		}

	}

}
