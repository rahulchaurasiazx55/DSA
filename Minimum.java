import java.lang.*;
import java.io.*;
import java.util.*;
class Minimum
{
	public static int Min0(int arr[],int n)
	{
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
				}
			}
		}
		return min;
	}


	public static int min1(int arr[],int n)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			min=Math.min(min,arr[i]);
		}
		return min;
	}


	public static void main(String[] args)
	{
		int arr[]={8,2,-1,4,5};
		int n=5;
		System.out.print(min1(arr,n));
	}
}