import java.lang.*;
import java.io.*;
import java.util.*;
class BFSTwoComponent
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int V,int u)
	{
		adj.get(u).add(V);
		adj.get(V).add(u);
	}
	public static void Traversal(ArrayList<ArrayList<Integer>>adj,int V,int s,boolean visited[])
	{
        Queue<Integer>q=new LinkedList<>();
        visited[s]=true;
        q.add(s);
        while(q.isEmpty()==false)
        {
        	int u=q.poll();
        	System.out.print(u+" ");
        	for(int v:adj.get(u))
        	{
        		if(visited[v]==false)
        		{
        			visited[v]=true;
        			q.add(v);
        		}
        	}
        }
	}
	public static void BFSdIS(ArrayList<ArrayList<Integer>>adj,int V)
	{
		boolean visited[]=new boolean[V+1];
		for(int i=0;i<V;i++)
		{
			if(visited[i]==false)
			{
				Traversal(adj,V,i,visited);
			}
		}
	}
	public static void main(String[] args)
	{
		int V=7;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(V);
		for(int i=0;i<V;i++)
		{
			adj.add(new ArrayList<Integer>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		addEdge(adj,4,5);
		addEdge(adj,4,6);
		BFSdIS(adj,V);
	}
}