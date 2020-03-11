package com.file.io;

import java.io.File;
import java.io.IOException;

public class TestFileDemo {

	public static void main(String[] args) throws IOException {
		File f = new File("abc.txt");
		System.out.println(f.exists());
		System.out.println(f.createNewFile());

	}

}
