package com.qa.basic;

class Student {
	String name;
	int rollno;
	 Student()
	{System.out.println("1st");}

	Student(String name, int rollno) {
		this.name = name;
		this.rollno = rollno;
	}

}

public class MyContructor {

	public static void main(String[] args) {

		Student s1 = new Student("Anil", 10);
		
		System.out.println(s1.name+" "+s1.rollno);
		Student s2 = new Student();
		Student s3 = new Student();
		Student s4 = new Student();

	}

}
