import java.lang.*;
import java.io.*;
import java.util.*;
class MaximumSubarraySum
{

    //brute force
    public static int max(int arr[],int n)
    {
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            int curr=0;
            for(int j=i;j<n;j++)
            {
                curr=curr+arr[j];
                res=Math.max(curr,res);
            }
        }
        return res;
    }
    //optimize

    public static int max1(int arr[],int n)
    {
        int maxe=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            maxe=Math.max((maxe+arr[i]),arr[i]);
            res=Math.max(maxe,res);
        }
        return res;
    }
    // public static void print(int arr[],int n)
    // {
    //     for(int i=0;i<n;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    public static void main(String[] args)
    {
       int arr[]={-8,-1,-9};
       int n=3;
       System.out.println(max1(arr,n));
       // print(arr,n);
    }
}