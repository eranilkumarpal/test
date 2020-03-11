package com.file.io;

import java.io.File;
import java.io.IOException;

public class TestFileDemo1 {

	public static void main(String[] args) throws IOException {
		File f = new File("anil123");
		f.mkdir();
		File f1 = new File("anil123", "anil123.txt");
		f1.createNewFile();

	}

}
