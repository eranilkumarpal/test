package com.qa.basic;

public class ReverseWordProg {

	public static void main(String[] args) {
		String str = "My name is Anil";
		String str1="";
		String a[]=str.split(" ");
		System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println("\n--------------");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

//		System.out.println("\n--------------");
//		for(int i=a.length-1;i>=0;i--)
//		{
//			str1= str1 +a[i]+ " ";
//		}
//		System.out.print(str1);
//		
	}

}
