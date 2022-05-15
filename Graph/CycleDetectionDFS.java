import java.lang.*;
import java.io.*;
import java.util.*;
class CycleDetectionDFS
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static boolean Cycle(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[],int parent)
	{
		visited[s]=true;
		for(int u:adj.get(s))
		{
			if(visited[u]==false)
			{
				if(Cycle(adj,u,visited,s)==true)
				{
					return true;
				}
			}
			else if(u!=parent)
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int v=8;
		boolean visited[]=new boolean[v];
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,3,4);
		addEdge(adj,3,5);
		addEdge(adj,4,5);
		addEdge(adj,4,6);
		addEdge(adj,6,7);
		System.out.print(Cycle(adj,0,visited,-1));
	}
}