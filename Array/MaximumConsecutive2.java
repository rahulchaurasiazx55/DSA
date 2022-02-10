import java.lang.*;
import java.io.*;
import java.util.*;
class MaximumConsecutive2
{
	//Approach 1 Brut force
	public static int maximum1(int arr[],int n)
	{
		int res=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			count=0;
			for(int j=i;j<n;j++)
			{
				if(arr[j]==1)
				{
					count++;
				}
				else{
					break;
				}
			}
			res=Math.max(res,count);
		}
		return res;
	}
	//Approach 2 Efficient
	public static int Maximum(int arr[],int n)
	{
		int res=0;
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==0)
			{
				count=0;
			}
			else{
				count++;
				res=Math.max(res,count);
			}
		}
		return res;
    }
    public static void main(String[] args)
	{
         int arr[]={0,1,0,1,1,1,1,0,0,1};
         int n=10;
         System.out.println(Maximum(arr,n));
         System.out.println(maximum1(arr,n));
	}
}