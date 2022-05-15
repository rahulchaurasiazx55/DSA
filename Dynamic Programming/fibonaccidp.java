import java.lang.*;
import java.io.*;
import java.util.*;
class fibonaccidp
{
	public static int fib(int n)
	{
		int dp[]=new int[n+1];
		for(int i=0;i<dp.length;i++)
		{
			dp[i]=-1;
		}
		dp[0]=0;
		dp[1]=1;
		for(int i=2;i<dp.length;i++)
		{
			if(dp[i]==-1)
			{
				dp[i]=dp[i-1]+dp[i-2];
			}
		}
		return dp[n];
	}
	public static void main(String [] args)
	{
		int n=8;
		System.out.print(fib(n));
	}
}