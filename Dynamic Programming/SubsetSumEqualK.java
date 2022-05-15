import java.lang.*;
import java.io.*;
import java.util.*;
class SubsetSumEqualK
{
	public static void main(String[] args)
	{
         int arr[]={1,2,3,4};
         int k=4;
         if(f(arr.length-1,k,arr)==true)
         {
         	System.out.println("True");
         }
         else{
         	System.out.println("False");
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