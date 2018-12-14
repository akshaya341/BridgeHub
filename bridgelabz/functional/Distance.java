package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Distance 
{
	public static void main(String[] args) 
	{
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		double res=Utility.distanceCal(x,y);
		System.out.println("Distance between two points : "+res);
	}

}
