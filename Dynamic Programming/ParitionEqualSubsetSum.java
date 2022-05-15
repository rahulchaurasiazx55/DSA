import java.io.*;
import java.util.*;
import java.lang.*;
class ParitionEqualSubsetSum
{
	public static void main(String[] args)
	{
      int arr[]={2,3,3,3,4,5};
      int total_sum=0;
      for(int i=0;i<arr.length;i++)
      {
      	total_sum+=arr[i];
      }
      int total=total_sum/2;
      if(total_sum%2!=0)
      {
      	System.out.println("False");
      }
      else{
      	if(f(arr.length-1,total,arr)==true)
      	{
      		System.out.println("True");
      	}
      	else{
      		System.out.println("False");
      	}
      }
	}
	public static boolean f(int index,int sum,int arr[])
	{
		if(sum==0)return true;
		if(index==0)return arr[0]==sum;
		boolean nottaken=f(index-1,sum,arr);
		boolean taken=false;
		if(sum>=arr[index])
		{
			taken=f(index-1,sum-arr[index],arr);
		}
		return nottaken||taken;
	}
}