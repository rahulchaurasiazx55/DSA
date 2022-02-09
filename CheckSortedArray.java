import java.lang.*;
import java.io.*;
import java.util.*;
class CheckSortedArray{
	public static boolean check(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[i])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args)
	{
		int arr[]={50,10,15,20,24};
		int n=5;
		System.out.println(check(arr,n));
	}
}