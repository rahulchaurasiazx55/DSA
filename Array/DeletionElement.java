import java.lang.*;
import java.io.*;
import java.util.*;
class DeletionElement
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int x=scn.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scn.nextInt();
		}
		n=Deletion(arr,n,x);
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]);
		}
	}
	public static int Deletion(int arr[],int n,int x)
	{
		int i=0;
        for(i=0;i<n;i++)
        {
        	if(arr[i]==x)
        	{
        		break;
        	}
        }
        for(int j=i;j<n-1;j++)
        {
        	arr[j]=arr[j+1];
        }
        return n-1;
	}
}