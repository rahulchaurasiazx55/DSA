import java.lang.*;
import java.io.*;
import java.util.*;
class knapsack
{

	public static long f(int n,int w,long weight[],long value[],Long dp[][])
	{
	  long pick=0;
      if(n==-1)
      {
      	return 0;
      }
      if(w==0)
      {
      	return 0;
      }
      if(dp[n][w]!=null)
      {
      	return dp[n][w];
      }
      if(weight[n]<=w)
      {
      	pick=f(n-1,w-(int)weight[n],weight,value,dp)+value[n];
      }
      long notp=f(n-1,w,weight,value,dp);
      dp[n][w]=Math.max(pick,notp);
      return dp[n][w];
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int w=scn.nextInt();
		long weight[]=new long [(int)n];
		long value[]=new long [(int)n];
		Long dp[][]=new Long[n][w+1];
		for(int i=0;i<n;i++)
		{
			weight[i]=scn.nextLong();
		}
		for(int i=0;i<n;i++)
		{
			value[i]=scn.nextInt();
		}
		System.out.println(f(n-1,w,weight,value,dp));
	}
}