package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Quadratic 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the 'a' value :");
		double a=Utility.getDouble();
		System.out.println("Enter the 'b' value :");
		double b=Utility.getDouble();
		System.out.println("Enter the 'c' value :");
		double c=Utility.getDouble();
		Utility.quadratic(a,b,c);
	}

}
