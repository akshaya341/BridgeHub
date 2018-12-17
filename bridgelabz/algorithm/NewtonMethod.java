package org.bridgelabz.algorithm;

import org.bridgelabz.utility.Utility;

public class NewtonMethod 
{
	public static void main(String[] args) 
	{
		System.out.println("enter the c value (non negative) :");
		double c=Utility.getFloat();
		Utility.sqrtNewton(c);
	}
}
