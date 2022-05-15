import java.lang.*;
import java.io.*;
import java.util.*;
class CountSubsetSumEqualToK
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k=scn.nextInt();
		int arr[]=new int[n];
		int dp[][]=new int[n][k+1];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<k;j++)
			{
				dp[i][j]=-1;
			}
		}
		System.out.println(f(0,k,arr,dp));
	}
	public static int f(int index,int k,int arr[],int dp[][])
	{
		if(index==arr.length)
		{
			if(k==0)
			{
				return 1;
			}
			else{
				return 0;
			}
		}
		int left=0;
		int right=0;
		if(dp[index][k]!=-1)
		{
			return dp[index][k];
		}
		if(arr[index]<=k){
		left=f(index,k-arr[index],arr,dp);
     	}
		right=f(index+1,k,arr,dp);
		return dp[index][k]=left+right;
	}
}