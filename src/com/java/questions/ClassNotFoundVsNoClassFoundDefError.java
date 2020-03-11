package com.java.questions;

import com.java.questions.*;

public class ClassNotFoundVsNoClassFoundDefError {

	public static void main(String[] args) {

		// try {
		// Class.forName("com.java.questions.Employee");
		// } catch (ClassNotFoundException e) {
		// e.printStackTrace();
		// }
		Employee emp = new Employee(101, "Anil");

		emp.display();
	}

}
