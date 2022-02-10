import java.lang.*;
import java.io.*;
import java.util.*;
//Two Approach 
//1-Approach o(n^2)
//2-Approach o(n)
class MaximumSumSubarray
{
	public static int Maximum(int arr[],int n)
	{
	   int res=arr[0];
	   for(int i=0;i<n;i++)
	   {
	   	int curr=0;
	   	for(int j=i;j<n;j++)
	   	{
	   		curr=curr+arr[j];
	   		res=Math.max(res,curr);
	   	}
	   }
	   return res;
	}
	public static int Maximum1(int arr[],int n)
	{
		int res=arr[0];
		int maxend=arr[0];
		for(int i=1;i<n;i++)
		{
			maxend=Math.max(maxend+arr[i],arr[i]);
			res=Math.max(res,maxend);
		}
		return res;
	}
	public static void main(String[] args)
	{
		int arr[]={1,-2,3,-1,2};
		int n=5;
		System.out.print(Maximum1(arr,n));
	}
}