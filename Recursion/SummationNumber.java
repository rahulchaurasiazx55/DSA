import java.lang.*;
import java.io.*;
import java.util.*;
class SummationNumber
{
	// public static void summ(int n,int sum)
	// {
	// 	if(n==0)
	// 	{
	// 		System.out.print(sum);
	// 		return;
	// 	}
	// 	summ(n-1,sum+n);
	// }
	public static int summ(int n)
	{
		if(n==0)
		{
			return 0;
		}
		return n+summ(n-1);
	}
	public static void main(String[] args)
	{
		int n=3;
		System.out.print(summ(n));
	}
}