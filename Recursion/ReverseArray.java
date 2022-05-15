import java.lang.*;
import java.io.*;
import java.util.*;
class ReverseArray
{
	public static void Rev(int n,int arr[])
	{
		if(n==0)
		{
			return;
		}
		System.out.println(arr[n-1]);
		Rev(n-1,arr);
	}
	public static void main(String[] args)
	{
		int n=5;
		int arr[]={1,2,3,4,5};
		Rev(n,arr);
	}
}