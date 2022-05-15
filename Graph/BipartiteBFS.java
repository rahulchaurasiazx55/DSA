import java.lang.*;
import java.io.*;
import java.util.*;
class BipartiteBFS
{
	public static void addEdge(ArrayList<ArrayList<Integer>>adj,int u,int v)
	{
		adj.get(u).add(v);
		adj.get(v).add(u);
	}
	public static boolean BFScheck(ArrayList<ArrayList<Integer>>adj,int start,int arr[])
	{
		Queue<Integer>q=new LinkedList<>();
		q.add(start);
		arr[start]=1;
		while(q.isEmpty()==false)
		{
			int j=q.poll();
			for(int k:adj.get(j))
			{
				if(arr[k]==-1)
				{
					arr[k]=1-arr[j];
					q.add(k);
				}
				else if(arr[k]==arr[j])
				{
					return false;
				}
			}
		}
		return true;
	}
	public static boolean checkBipartite(ArrayList<ArrayList<Integer>>adj,int v)
	{
		int arr[]=new int[v];
		for(int i=0;i<v;i++)
		{
			arr[i]=-1;
		}
		for(int i=0;i<v;i++)
		{
			if(arr[i]==-1)
			{
				if(BFScheck(adj,i,arr)==false)
				{
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args)
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
		System.out.print(checkBipartite(adj,v));
	}
}