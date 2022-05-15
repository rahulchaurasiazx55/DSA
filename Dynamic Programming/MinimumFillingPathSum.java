import java.lang.*;
import java.io.*;
import java.util.*;
class MinimumFillingPathSum
{
	//Approach 1 Recursive
	public static void main(String[] args)
	{
	    Scanner scn=new Scanner(System.in);
	    int n=scn.nextInt();
	    int m=scn.nextInt();
		int matrix[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				matrix[i][j]=scn.nextInt();
			}
		}
		int dp[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				dp[i][j]=0;
			}
		}
		int maxi=Integer.MIN_VALUE;
		for(int j=0;j<m;j++)
		{
			maxi=Math.max(maxi,f2(n-1,j,matrix,dp));
		}
		System.out.println(maxi);
	}
	//Approach 2 Memoization
	public static int f1(int i,int j,int matrix[][],int dp[][])
	{
		if(j<0 || j>=matrix[0].length) return Integer.MIN_VALUE;
		if(i==0) return matrix[0][j];
		if(dp[i][j]!=-1)
		{
			return dp[i][j];
		}
		int left=matrix[i][j]+f1(i-1,j-1,matrix,dp);
		int upper=matrix[i][j]+f1(i-1,j,matrix,dp);
		int right=matrix[i][j]+f1(i-1,j+1,matrix,dp);
		dp[i][j]=Math.max(upper,Math.max(left,right));
		return dp[i][j];
	}
	//Approach 3 Tabulation
	public static int f2(int i,int j,int matrix[][],int dp[][])
	{
		int left=0;
		int right=0;
		for(j=0;j<matrix[0].length;j++)
		{
			dp[0][j]=matrix[0][j];
		}
		for(i=1;i<matrix.length;i++)
		{
			for(j=0;j<matrix[0].length;j++)
			{
				if(j-1>=0)
				{
				left=matrix[i][j]+f2(i-1,j-1,matrix,dp);
		     	}
		     	else{
		     		left+=Integer.MIN_VALUE;
		     	}
				int upper=matrix[i][j]+f2(i-1,j,matrix,dp);
				if(j+1<matrix[0].length)
				{
				right=matrix[i][j]+f2(i-1,j+1,matrix,dp);
			    }
			    else{
			    	right+=Integer.MIN_VALUE;
			    }
				dp[i][j]=Math.max(upper,Math.max(left,right));
			}
		}
		int maxi=Integer.MIN_VALUE;
		for(j=0;i<matrix[0].length;j++)
		{
           maxi=Math.max(maxi,dp[matrix.length-1][j]);
		}
		return maxi;
	}
	public static int f(int i,int j,int matrix[][])
	{
        if(j<0 || j>=matrix[0].length) return Integer.MIN_VALUE;
        if(i==0) return matrix[0][j];
        int upper=matrix[i][j]+f(i-1,j,matrix);
        int left=matrix[i][j]+f(i-1,j-1,matrix);
        int right=matrix[i][j]+f(i-1,j+1,matrix);
        return Math.max(upper,Math.max(left,right));
	}
}