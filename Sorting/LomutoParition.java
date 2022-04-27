import java.lang.*;
import java.io.*;
import java.util.*;
class LomutoParition
{
	public static void main(String[] args)
	{
		int arr[]={10,80,30,90,40,50,70};
		int l=0;
		int h=arr.length-1;
		lomuto(arr,l,h);
		print(arr);
	}
	public static void lomuto(int arr[],int l,int h)
	{
		int pivot=arr[arr.length-1];
		int i=l-1;
		for(int j=l;j<=h-1;j++)
		{
			if(arr[j]<pivot)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		int temp=arr[i+1];
		arr[i+1]=arr[h];
		arr[h]=temp;
	}
	public static void print(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}