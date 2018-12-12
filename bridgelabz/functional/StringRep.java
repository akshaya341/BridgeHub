package org.bridgelabz.functional;

import org.bridgelabz.utility.Utility;

public class StringRep 
{
public static void main(String[] args)
{
	
	String st="Hello <<username>>, How are you?";
	StringRep sr=new StringRep();
	String res=sr.getStringReplace(st);
	System.out.println(res);
}

private String getStringReplace(String st) 
{
	
	String str=Utility.getString();
	if(str.length()<=3)
	{
		System.out.println("Enter name atleat 3 character");
		return null;
	}
	else {
	String temp="";
	temp=st.substring(0, 6);
	temp+=str;
	temp+=st.substring(18,32);

	return temp;
	}
}
}

