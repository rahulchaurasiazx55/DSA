import java.lang.*;
import java.io.*;
import java.util.*;
class CountingConnectedComponent
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static void BFS(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[])
	{
		visited[s]=true;
		Queue<Integer>q=new LinkedList<>();
		q.add(s);
		while(q.isEmpty()==false){
         int u=q.poll();
         // System.out.print(u+" ");
		for(int g:adj.get(u))
		{
			if(visited[g]==false)
			{
				visited[g]=true;
				q.add(g);
			}
		}
	  }
	}
	public static int BFSDIS(ArrayList<ArrayList<Integer>>adj,int v,boolean visited[])
	{
		int count=0;
		for(int i=0;i<v;i++)
		{
			if(visited[i]==false)
			{
				BFS(adj,i,visited);
				count++;
			}
		}
		return count;
	}
	public static void main (String[] args)
	{
		int v=11;
		boolean visited[]=new boolean[v+1];
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,0,2);
		addEdge(adj,1,2);
		addEdge(adj,3,4);
		addEdge(adj,5,6);
		addEdge(adj,5,7);
		addEdge(adj,6,7);
		addEdge(adj,8,9);
		addEdge(adj,8,10);
		addEdge(adj,9,10);
		System.out.print(BFSDIS(adj,v,visited));
	}
}