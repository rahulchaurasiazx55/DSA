import java.lang.*;
import java.io.*;
import java.util.*;
//Two Approach
//Appraoch-1-o(n^2)

//Approach -2-o(n)
class LeftRotateByD
{
	public static void LeftR(int arr[],int n,int d)
	{
       int x=arr[0];
       for(int i=1;i<n;i++)
       {
       	arr[i-1]=arr[i];
       }
       arr[n-1]=x;
	}
	public static void LeftD(int arr[],int n,int d)
	{
     for(int i=0;i<d;i++)
     {
     	LeftR(arr,n,d);
     }
     for(int i=0;i<n;i++)
     {
     	System.out.print(arr[i]);
     }
	}
   
   //Approach 2
   
   public static void Rotate(int arr[],int n,int d)
   {
     reverse(arr,0,d-1);
     reverse(arr,d,n-1);
     reverse(arr,0,n-1);
     for(int i=0;i<n;i++)
     {
     	System.out.print(arr[i]+" ");
     }
   }
   public static void reverse(int arr[],int low,int high)
   {
        while(low<high)
        {
        	int temp=arr[low];
        	arr[low]=arr[high];
        	arr[high]=temp;
        	low++;
        	high--;
        }
   }
	public static void main(String[] args)
	{
		int arr[]={1,2,3,4,5};
		int n=5;
		int d=2;
		Rotate(arr,n,d);
	}
}