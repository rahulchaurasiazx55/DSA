import java.lang.*;
import java.io.*;
import java.util.*;
class InsertElement
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int arr[]=new int[5];
		    arr[0]=5;
	        arr[1]=10;
		    arr[2]=20;
		    arr[3]=30;
		int pos=scn.nextInt();
		int x=scn.nextInt();
		int index=pos-1;
		for(int i=n-1;i>=index;i--)
		{
			arr[i+1]=arr[i];
		}
		arr[index]=x;
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}