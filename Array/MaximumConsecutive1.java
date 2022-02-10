import java.lang.*;
import java.io.*;
import java.util.*;
class MaximumConsecutive1{
	public static int Maximum(int arr[],int n)
	{
		int res=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(arr[j]==0)
				{
					count=0;
				}
				else{
					count++;
					res=Math.max(count,res);
				}
			}
		}
		return res;
	}
	public static void main(String[] args)
	{
		int arr[]={0,0,1,1,1,1,0,1,1,0,0};
		int n=11;
		System.out.print(Maximum(arr,n));
	}
}