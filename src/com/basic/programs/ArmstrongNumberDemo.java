package com.basic.programs;

public class ArmstrongNumberDemo {

	public static void main(String[] args) {

		int number = 371, orginalNumber, remainder, result = 0;
		orginalNumber = number;
		while (orginalNumber != 0) {
			remainder = orginalNumber % 10;
			result += Math.pow(remainder, 3);
			orginalNumber /= 10;
		}
		if (result==number)
			System.out.println("The number is Armstrong");
		else
			System.out.println("The number is not Armstrog");

	}

}
