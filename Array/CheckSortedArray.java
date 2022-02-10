import java.lang.*;
import java.io.*;
import java.util.*;
//Two approach
// first one O(n^2)
// second one O(n)
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
	public static boolean check1(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
          if(arr[i-1]>arr[i])
          {
            return false;
          }
		}
		return true;
	}
	public static void main(String[] args)
	{
		int arr[]={5,10,20,25,30};
		int n=5;
		System.out.println(check(arr,n));
		System.out.println(check1(arr,n));
	}
}