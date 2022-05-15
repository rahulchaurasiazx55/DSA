import java.lang.*;
import java.util.*;
import java.io.*;
class GenerateSubset{
	public static List<List<Integer>> Generate(int arr[],int n)
	{
         List<List<Integer>>final1=new ArrayList<>();
         List<Integer>res=new ArrayList<>();
         func(arr,n,0,final1,res);
         return final1;
	}
	public static void func(int arr[],int n,int index,List<List<Integer>>final1,List<Integer>res){
		if(index==n)
		{
			final1.add(new ArrayList<>(res));
			return;
		}
		res.add(arr[index]);
		func(arr,n,index+1,final1,res);
		res.remove(res.size()-1);
		func(arr,n,index+1,final1,res);
	}
	public static void main(String[] args)
	{
		int arr[]={1,2,3};
		int n=3;
		System.out.println(Generate(arr,n));
	}
}