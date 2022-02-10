import java.lang.*;
import java.io.*;
import java.util.*;
//Approach 1-Hashing o(n) space o(n)
//Approach 2-Two pointer binary search o(n)
class SortedPairGivenSum
{
	public static boolean pair0(int arr[],int n,int x)
	{
		HashSet<Integer>map=new HashSet<>();
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
			{
				return true;
			}
			if(map.contains(x-arr[i]))
			{
				return true;
			}
			map.add(arr[i]);
		}
		return false;
	}
	public static boolean pair(int arr[],int n,int x)
	{
		int left=0;
		int right=n-1;
		while(left<=right)
		{
		    if(arr[left]+arr[right]==x)
		    {
		    	return true;
		    }
		    else if(arr[left]+arr[right]>x)
		    {
		    	right--;
		    }
		    else{
		    	left++;
		    }
		}
		return false;
	}
	public static void main(String[] args)
	{
		int arr[]={5,10,15,20,25,30};
		int n=6;
		int x=10;
		System.out.println(pair0(arr,n,x));
	}
}