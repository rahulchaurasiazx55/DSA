import java.lang.*;
import java.io.*;
import java.util.*;
//APPROACH 1-O(N^2)
class LeadersArray
{
	public static void  Leader(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			boolean flag=false;
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]<=arr[j])
				{
					flag=true;
					break;
				}
			}
			if(flag==false){
			System.out.print(arr[i]+ " ");
		}
		}
	}
//APPROACH 2-O(N)
	public static void Leader1(int arr[],int n)
	{
		int current_leader=arr[n-1];
		System.out.print(current_leader);
		for(int i=n-2;i>=0;i--)
		{
			if(current_leader<=arr[i]){
			current_leader=arr[i];
			System.out.print(current_leader + " ");
		    }
		}
	}
	public static void main(String[] args)
	{
		int arr[]={2,3,10,6,7,5,2};
		int n=7;
        Leader(arr,n);
	}
}