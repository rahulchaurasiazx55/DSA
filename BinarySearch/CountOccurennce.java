import java.lang.*;
import java.util.*;
import java.io.*;
class CountOccurennce{
	public static int First(int arr[],int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<x)
			{
				low=mid+1;
			}
			else if(arr[mid]>x)
			{
				high=mid-1;
			}
			else{
				if(mid==0 || arr[mid-1]!=arr[mid])
				{
					return mid;
				}
				else{
					high=mid-1;
				}
			}
		}
		return -1;
	}
		public static int Last(int arr[],int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]<x)
			{
				low=mid+1;
			}
			else if(arr[mid]>x)
			{
				high=mid-1;
			}
			else {
				if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
				{
					return mid;
				}
				else{
					low=mid+1;
				}
			}
		}
		return -1;
	}
	public static int Count(int arr[],int x)
	{
       int h=First(arr,x);
       if(x==-1)
       {
       	return 0;
       }
       else {
       	return (Last(arr,x)-h+1);
       }
	}
	public static void main(String[] args)
	{
      int arr[]={5,10,10,10,20,20};
      int x=20;
      System.out.println(Count(arr,x));
	}
}