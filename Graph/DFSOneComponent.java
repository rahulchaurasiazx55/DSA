import java.lang.*;
import java.io.*;
import java.util.*;
class DFSOneComponent
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void  DfsTraversal(ArrayList<ArrayList<Integer>>adj,int s,int v,boolean visited[])
	{
		visited[s]=true;
		System.out.print(s+" ");
		for(int g:adj.get(s))
		{
			if(visited[g]==false)
			{
				DfsTraversal(adj,g,v,visited);
			}
		}
	}
	public static void Dfs(ArrayList<ArrayList<Integer>>adj,int s,int v)
	{
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				DfsTraversal(adj,i,v,visited);
			}
		}
	}
	public static void main(String[] args)
	{
		int v=7;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,2,3);
		addEdge(adj,4,5);
		addEdge(adj,4,6);
		addEdge(adj,5,6);
		Dfs(adj,0,v);
	}
}