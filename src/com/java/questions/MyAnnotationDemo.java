package com.java.questions;

class Employee01 {

	@Deprecated
	public void net_salary() {

		System.out.println("My salary structure is Basic,HR and TA ");

	}

	public void net_salary_incr() {
		System.out.println("My increment salary structure is Basic,HR,TA and PF allowance");
	}
}

public class MyAnnotationDemo extends Employee01 {

	public static void main(String[] args) {

		Employee01 emp = new Employee01();
		emp.net_salary();

	}

}
