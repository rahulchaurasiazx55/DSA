import java.lang.*;
import java.io.*;
import java.util.*;
class PrintNumber
{
	// public static void Print(int n)
	// {
 //       if(n==0)
 //       {
 //       	return;
 //       }
 //       System.out.println(n);
 //       Print(n-1);
	// }
	public static void Print(int n,int i)
	{
		if(i>n)
		{
			return;
		}
		System.out.println(i);
		Print(n,i+1);
	}
	public static void main(String[] args)
	{
		int i=1;
		int n=8;
		Print(n,i);
	}
}