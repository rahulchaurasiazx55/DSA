import java.lang.*;
import java.io.*;
import java.util.*;
public class NaivePartition
{
	public static void main(String[] args)
	{
		// Scanner scn=new Scanner(System.in);
		int arr[]={2,7,8,3,7};
		int p=4;
		parition(arr,p);
	}
	public static void parition(int arr[],int p)
	{
		int count=0;
		int temp[]=new int[arr.length];
		int part=arr[p];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
           if(arr[i]<arr[p])
           {
           	  temp[k++]=arr[i];
           	  count++;
           }
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[p])
			{
				temp[k]=arr[i];
				k++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>part)
			{
				temp[k++]=arr[i];
			}
		}
		for(int i=0;i<temp.length;i++)
		{
			System.out.print(temp[i]+" ");
		}
	}
}