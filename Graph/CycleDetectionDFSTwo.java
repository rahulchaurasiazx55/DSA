import java.lang.*;
import java.io.*;
import java.util.*;
class CycleDetectionDFSTwo
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static boolean DFS(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[],int parent)
	{
		visited[s]=true;
		for(int u:adj.get(s))
		{
			if(visited[u]==false)
			{
				if(DFS(adj,u,visited,s)==true)
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
	public static boolean DFSDis(ArrayList<ArrayList<Integer>>adj,int v,int s,int parent)
	{
		boolean visited[]=new boolean[v];
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				if(DFS(adj,i,visited,-1)==true)
				{
					return true;
				}
			}
		}
		return false;
	}
	public static void main(String[] args)
	{
		int v=6;
		boolean visited[]=new boolean[v];
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,3,4);
		addEdge(adj,3,5);
		System.out.print(DFSDis(adj,v,0,-1));
	}
}