import java.lang.*;
import java.io.*;
import java.util.*;
class BinarySearch{
	public static int Binary(int arr[],int x)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]<x)
			{
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int arr[]={5,10,15,20,25};
		int x=30;
		System.out.println(Binary(arr,x));
	}
}