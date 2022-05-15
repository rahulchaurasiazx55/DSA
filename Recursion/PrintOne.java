import java.lang.*;
import java.io.*;
import java.util.*;
class PrintOne
{
	static int count=0;
	public static void Print()
	{
		if(count==5)
		{
			return;
		}
        System.out.println("1");
        count++;
        Print();
	}
	public static void main(String[] args)
	{
		Print();
	}
}