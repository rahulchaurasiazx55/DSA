import java.lang.*;
import java.io.*;
import java.util.*;
class fibonacci{
	public static int fibo(int n)
	{
		if(n<=1)
		{
			return n;
		}
		int ans=fibo(n-1)+fibo(n-2);
		return ans;
	}
	public static void main(String[] args)
	{
      int n=4;
      System.out.println(fibo(n));
	}
}