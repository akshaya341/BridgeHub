package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class Power 
{
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		if(n>31)
		{
			System.out.println("please, enter the number less than 31");
		}
		else
		{
		Utility ul=new Utility();
		int res=ul.pow(2,n);
		System.out.println(res);
		for(int i=1;i<=n;i++)
		{
			int rs=(int) Math.pow(2, i);
		
		System.out.println(rs);
		}
		}
	}


}

