import java.lang.*;
import java.io.*;
import java.util.*;
class SearchInsert{
	public static int  SearIn(int arr[],int x){
		int ans=-1;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(arr[mid]<x){
				ans=mid;
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return ans+1;
	}
	public static void main(String[] args)
	{
		int arr[]={5,10,15,20};
		int x=6;
		System.out.println(SearIn(arr,x));
	}
}