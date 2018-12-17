package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class CouponNumber 
{
	public static void main(String[] args) 
	{
      System.out.println("Enter the number of coupon number ");
      int n=Utility.getInt();
      System.out.print("Enter the distinct coupon numbers ");
      int ar[]=new int[n];
      for (int i = 0; i <n; i++) 
      {
    	  ar[i]=Utility.getInt();
      }
      int res=Utility.couponCom(ar);
      System.out.println(res);
		
	}
}
