import java.lang.*;
import java.io.*;
import java.util.*;
class SecondLargest{
	public static void Second(int arr[],int n)
	{
       int max=arr[0];
       int index=0;
       for(int i=0;i<n;i++)
       {
       	if(max<arr[i])
       	{
       		max=arr[i];
       		index=i;
       	}
       }
       int max2=-1;
       for(int i=0;i<n;i++)
       {
       	if(arr[i]!=max && index!=i)
       	{
       		if(max2<arr[i])
       		{
       			max2=arr[i];
       		}
        }
       }
       System.out.println(max2);
	}
	public static void main(String[] args)
	{
		int arr[]={100,20,40,90,30,400,359};
		int n=7;
		Second(arr,n);
	}
}