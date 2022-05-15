import java.lang.*;
import java.io.*;
import java.util.*;
class DetectCycleDirectedGraph2
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
	}
	public static boolean DetectCycle(ArrayList<ArrayList<Integer>>adj,int v)
	{
		int count=0;
		int indegree[]=new int[v];
		for(int i=0;i<v;i++)
		{
			for(int u:adj.get(i))
			{
				indegree[u]++;
			}
		}
		Queue<Integer>q=new LinkedList<>();
		for(int i=0;i<v;i++)
		{
			if(indegree[i]==0)
			{
				q.add(i);
			}
		}
		while(q.isEmpty()==false){
		 int pop=q.poll();
		for(int x:adj.get(pop))
		{
			if(--indegree[x]==0)
			{
				q.add(x);
			}
		}
		count++;
	  }
	  if(count==v)
	  {
        return false;
	  }
	  else{
	  	return true;
	  }
	}
	public static void main(String[] args)
	{
		int v=5;
		ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
		for(int i=0;i<v;i++)
		{
			adj.add(new ArrayList<>());
		}
		addEdge(adj,0,1);
		addEdge(adj,1,2);
		addEdge(adj,1,3);
		addEdge(adj,2,3);
		System.out.print(DetectCycle(adj,v));
	}
}