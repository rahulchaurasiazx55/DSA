import java.lang.*;
import java.util.*;
import java.io.*;
class FirstOccurence{
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
	public static void main(String[] args)
	{
      int arr[]={5,10,20,20,20,30};
      int x=30;
      System.out.println(First(arr,x));
	}
}