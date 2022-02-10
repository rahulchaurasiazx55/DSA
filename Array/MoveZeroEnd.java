import java.lang.*;
import java.io.*;
import java.util.*;
class MoveZeroEnd{
	//Brute force 
	public static void Move1(int arr[],int n)
	{
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==0)
				{
					if(arr[j]!=0)
					{
						int temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	//Efficient code
	public static void Move2(int arr[],int n)
	{
         int count=0;
         for(int i=0;i<n;i++)
         {
         	if(arr[i]!=0)
         	{
         		int temp=arr[i];
         		arr[i]=arr[count];
         		arr[count]=temp;
         		count++;
         	}
         }
         for(int i=0;i<n;i++)
         {
         	System.out.print(arr[i]+ " ");
         }
	}
	public static void main(String[] args)
	{
		int arr[]={0,0,0,4,0,5,10,34,21};
		int n=9;
        Move1(arr,n);
        System.out.println();
        Move2(arr,n);
	}
}