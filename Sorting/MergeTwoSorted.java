import java.lang.*;
import java.io.*;
import java.util.*;
class MergeTwoSorted
{
	public static void main(String[] arg)
	{
		int a[]={10,15,20};
		int b[]={5,6,6,15};
		int m=3;
		int n=4;
		merge(a,m,b,n);
	}
	public static void merge(int a[],int m,int b[],int n)
	{
		int i=0;
		int j=0;
		while(i<m && j<n)
		{
			if(a[i]<=b[j])
			{
              System.out.print(a[i++]+" ");
			}
			else{
			  System.out.print(b[j++]+" ");
			}
		}
		while(i<m)
		{
			System.out.print(a[i++]+" ");
		}
		while(j<n)
		{
			System.out.print(b[j++]+" ");
		}
	}
}