package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Distance 
{
	public static void main(String[] args) 
	{
		double x=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double res=Utility.distanceCal(x,y);
		System.out.println("Distance between two points : "+res);
	}

}
