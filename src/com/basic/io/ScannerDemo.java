package com.basic.io;

import java.util.Scanner;

class ScannerDemo {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		String yourname = input.nextLine();
		System.out.printf("Hello, %s !!!",yourname);

	}

}
