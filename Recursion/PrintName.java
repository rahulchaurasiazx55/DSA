import java.lang.*;
import java.io.*;
import java.util.*;
class PrintName
{
	static int count=0;
	public static void Print()
	{
		if(count==5)
		{
			return ;
		}
		System.out.println("Rahul");
		count++;
		Print();
	}
	public static void main(String[] args)
	{
		Print();
	}
}