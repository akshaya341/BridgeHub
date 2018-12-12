package org.bridgelabz.utility;

import java.util.Scanner;

public class Utility 
{
	static Scanner scn=new Scanner(System.in);
	public static int getInt()
	{
		System.out.println("Enter your value : ");
		int n=scn.nextInt();
		return n;
	}
	public static double getDouble()
	{
		System.out.println("Enter your value : ");
		double n=scn.nextDouble();
		return n;
	}
	public static String getString()
	{
		System.out.println("Enter your String/Sentence : ");
		String n=scn.nextLine();
		return n;
	}
	public static float getFloat()
	{
		System.out.println("Enter your value : ");
		float n=scn.nextFloat();
		return n;
	}
	
	
	
	
	}

