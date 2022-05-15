import java.lang.*;
import java.io.*;
import java.util.*;
class DetectCycleDirectedGraph
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
	}
	public static boolean DFS(ArrayList<ArrayList<Integer>>adj,int s,boolean visited[],boolean resS[])
	{
       visited[s]=true;
       resS[s]=true;
       for(int u:adj.get(s))
       {
       	  if(visited[u]==false && DFS(adj,u,visited,resS)==true)
       	  {
       	  	return true;
       	  }
       	  else if(resS[u]==true)
       	  {
       	  	return true;
       	  }
       }
       resS[s]=false;
       return false;
	}
	public static boolean DFSDIS(ArrayList<ArrayList<Integer>>adj,int v)
	{
       	boolean visited[]=new boolean[v];
		boolean resS[]=new boolean[v];
       for(int i=0;i<v;i++)
       {
       	if(visited[i]==false)
       	{
       		if(DFS(adj,i,visited,resS)==true);
       		{
       			return true;
       		}
       	}
       }
       return false;
	}
	public static void main(String[] args)
	{
		int v=3;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<ArrayList<Integer>>(v);
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}	
			addEdge(adj,0,1); 
		    addEdge(adj,1,3);
		    addEdge(adj,2,1);
		    addEdge(adj,2,3);
		 System.out.print((DFSDIS(adj,v)));
	}
}