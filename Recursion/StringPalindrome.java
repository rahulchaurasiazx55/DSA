import java.lang.*;
import java.io.*;
import java.util.*;
class StringPalindrome
{
	public static boolean Check(int i,int n,char s[])
	{
		if(i>=n/2)
		{
			return true;
		}
		if(s[i]!=s[n-i-1])
		{
			return false;
		}
		return Check(i+1,n,s);
	}
	public static void main(String[] args)
	{
		int n=5;
		char s[]={'M','A','D','R','M'};
		System.out.print(Check(0,n,s));
	}

}