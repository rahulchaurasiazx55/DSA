import java.lang.*;
import java.io.*;
import java.util.*;
class Factorial 
{
	public static int fac(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return (n*fac(n-1));
	}
	public static void main(String[] args)
	{
		int n=6;
		System.out.print(fac(n));
	}
}