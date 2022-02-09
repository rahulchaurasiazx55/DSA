import java.lang.*;
import java.io.*;
import java.util.*;
class LeftRotateByOne{
	public static void LeftR(int arr[],int n)
	{
		int x=arr[0];
		for(int i=1;i<n;i++)
		{
			arr[i-1]=arr[i];
		}
		arr[n-1]=x;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		int n=5;
		LeftR(arr,n);
	}
}