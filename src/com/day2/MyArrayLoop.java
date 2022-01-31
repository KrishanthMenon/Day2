package com.day2;
import java.util.Scanner;

public class MyArrayLoop 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter: ");
		int[] a= s.nextInt();
		System.out.println("Result: ");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
