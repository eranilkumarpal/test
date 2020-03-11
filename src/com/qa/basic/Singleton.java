package com.qa.basic;

public class Singleton {

	private static Singleton singleton_Instance = null;
	private String str;

	private Singleton() {
		str = "Hey, this is singleton class pattern";
	}

	private static Singleton getInstance() {
		if (singleton_Instance == null)
			singleton_Instance = new Singleton();
		return singleton_Instance;
	}

	public static void main(String[] args) {

		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		x.str = x.str.toUpperCase();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

	}

}
