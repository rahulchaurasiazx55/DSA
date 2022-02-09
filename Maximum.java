import java.lang.*;
import java.io.*;
import java.util.*;
//Two Approach
//1-APPROACH O(N^2)
//2-APPROACH O(N)
class Maximum
{
	public static int Max(int arr[],int n )
	{
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]>max)
				{
					max=arr[j];
				}
			}
		}
		return max;
	}

	
	public static int Max1(int arr[],int n)
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			max=Math.max(max,arr[i]);
		}
		return max;
	}
	public static void main(String[] args)
	{
		int arr[]={3,4,20,6,7};
		int n=5;
		System.out.println(Max(arr,n));
		System.out.println(Max1(arr,n));
	}
}