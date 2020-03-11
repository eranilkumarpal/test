package com.file.io;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class TestCSVFile {

	public static void main(String[] args) throws IOException {

		
		
		BufferedReader br = new BufferedReader(new FileReader("extract.csv"));
		//String mobile="9876567890";
		String line=br.readLine();
		line= br.readLine();
		while ((line  != null)) {
			
		    // use comma as separator
		    String[] cols = line.split(";");
		   System.out.println("Coulmn 0= " + cols[0] + " , Column 4= " + cols[4]);
		   // if(cols[2].contains(mobile))
		    //{ System.out.println(cols[0]+""+cols[4]);}
		    
		    line= br.readLine();
		    
		}
		
		br.close();

}
}