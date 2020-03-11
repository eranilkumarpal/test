package com.qa.basic;

abstract class Vechicle {
	// public abstract void getNoOfTire();

	public void getEngine() {
		System.out.println("This is Grandi10 petrol engine");
	}
}

class Car extends Vechicle {

	public void getNoOfTire() {
		System.out.println("No of wheel in car is four");
	}
}

public class MyAbstractClass {

	public static void main(String[] args) {
		Car car = new Car();
		car.getNoOfTire();
		car.getEngine();
	}

}
