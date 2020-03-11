package com.qa.basic;

public class NumberPattern6 {

	public static void main(String[] args) {
		for (int i = 1; i <= 7; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= 7; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i = 6; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= 7; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
	}

}
