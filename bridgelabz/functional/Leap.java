package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Leap 
{
	public static void main(String[] args) 
	{
	  Leap ln=new Leap();
	 String str=Utility.getString();
	 

		if(str.length()<4 || str.length()>4)
		{
			System.out.println("please enter four digit number");
		}
		else {
	  boolean res=ln.isLeap(str);
	  if(res)
	  {
		  System.out.println("Leap year");
	  }
		  else {
			  System.out.println("Not a Leap year");
		  }
		}
	}

	private boolean isLeap(String str) 
	{
	
			int n=Integer.parseInt(str);
			if(n%4==0 && n%100 !=0 ||n%400==0)
				return true;
		
		return false;
	}

}
