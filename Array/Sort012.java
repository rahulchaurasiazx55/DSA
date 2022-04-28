import java.lang.*;
import java.io.*;
import java.util.*;
class Sort012
{
	//Brute force O(n)Time and O(n) space
	public static void sort1(int arr[],int n)
	{
      int temp[]=new int[n];
      int k=0;
      for(int i=0;i<n;i++)
      {
      	if(arr[i]==0)
      	{
      		temp[k++]=arr[i];
      	}
      }
      for(int i=0;i<n;i++)
      {
      	if(arr[i]==1)
        {
        	temp[k++]=arr[i];

        }
      }
      for(int i=0;i<n;i++)
      {
      	if(arr[i]==2)
      	{
      		temp[k++]=arr[i];
      	}
      }
      for(int i=0;i<temp.length;i++)
      {
          arr[i]=temp[i];
      }
	}
  // Second Approach
  public static void sort2(int arr[],int n)
  {
     Arrays.sort(arr);

  }
	//optimize Dutch National Flag Algoritm

	public static void sort3(int arr[],int n)
	{
		int low=0,mid=0;
		int high=n-1;
        while(mid<=high)
        {
        	if(arr[mid]==0)
        	{
        		int temp=arr[low];
        		arr[low]=arr[mid];
        		arr[mid]=temp;
        		low++;
                mid++;
        	}
        	else if(arr[mid]==1)
        	{
        		mid++;
        	}
        	else{
        		int temp=arr[mid];
        		arr[mid]=arr[high];
        		arr[high]=temp;
        		high--;
        	}
        }
	}
  public static void print(int arr[],int n)
  {
      for(int i=0;i<n;i++)
      {
        System.out.print(arr[i]+" ");
      }
  }
	public static void main(String[] args)
	{
		int arr[]={0,2,1,0,2,1,2,0,1,1,1,2,0};
		int n=13;
		sort3(arr,n);
    print(arr,n);
	}
}