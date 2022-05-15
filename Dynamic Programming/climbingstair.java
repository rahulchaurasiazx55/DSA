import java.lang.*;
import java.io.*;
import java.util.*;
class climbingstair
{
	//recursion
	public static int climb(int n)
	{
		if(n==0)
		{
			return 1;
		}
		if(n==1)
		{
			return 1;
		}
		return climb(n-1)+climb(n-2);
	}


    //tabulation

    public static int climbj(int n)
    {
    	int dp[]=new int[n+1];
    	for(int i=0;i<dp.length;i++)
    	{
    		dp[i]=-1;
    	}
    	dp[0]=1;
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


     //memoization


    public static int climbg(int n)
    {
    	int dp[]=new int[n+1];
    	for(int i=0;i<dp.length;i++)
    	{
    		dp[i]=-1;
    	}
    	if(n==0)
    	{
    		return 1;
    	}
    	if(n==1)
    	{
    		return 1;
    	}
    	if(dp[n]==-1)
    	{
    		dp[n]=climbg(n-1)+climbg(n-2);
    	}
    	return dp[n];
    } 


    //space otimized approach

	public static void main(String[] args)
	{
		int n=4;
		System.out.println(climbg(n));
	}
}