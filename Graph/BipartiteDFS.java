import java.lang.*;
import java.io.*;
import java.util.*;
class BipartiteDFS
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static boolean DFS(ArrayList<ArrayList<Integer>>adj,int start,int color[])
	{
		if(color[start]==-1)
		{
			color[start]=1;
		}
		for(int u:adj.get(start))
		{
			if(color[u]==-1)
			{
				color[u]=1-color[start];
				if(DFS(adj,u,color)==false)
				{
					return false;
				}
			}
			else if(color[u]==color[start])
			{
				return false;
			}
		}
		return true;
	}
	public static boolean Check(ArrayList<ArrayList<Integer>>adj,int v)
	{
		int color[]=new int[v];
		for(int i=0;i<v;i++)
		{
			color[i]=-1;
		}
		for(int i=0;i<v;i++)
		{
			if(color[i]==-1)
			{
				if(DFS(adj,i,color)==false)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[]args)
	{
		int v = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < v; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(0).add(1);
		adj.get(1).add(0);

		adj.get(1).add(2);
		adj.get(2).add(1);

		adj.get(2).add(3);
		adj.get(3).add(2);

		adj.get(4).add(3);
		adj.get(3).add(4);

		adj.get(4).add(5);
		adj.get(5).add(4);

		adj.get(4).add(6);
		adj.get(6).add(4);

		adj.get(1).add(6);
		adj.get(6).add(1);
		System.out.print(Check(adj,v));
	}
}