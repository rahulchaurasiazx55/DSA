import java.lang.*;
import java.io.*;
import java.util.*;
class ReverseArray{
	public static void Reverse(int arr[],int n)
	{
		int low=0;
		int high=n-1;
		while(low<=high)
		{
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static void main(String[] args)
	{
		int arr[]={5,10,15,20,25};
		int n=5;
        Reverse(arr,n);
	}
}