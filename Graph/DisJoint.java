import java.lang.*;
import java.io.*;
import java.util.*;
class DisJoint
{
   static int parent[]=new int[100000];
 static int rank[]=new int[100000];
   public static void makeSet(int n)
   {
   	for(int i=1;i<=n;i++)
   	{
   		parent[i]=i;
   		rank[i]=0;
   	}
   }
   public static int findpar(int node)
   {
   	if(parent[node]==node)
   	{
   		return node;
   	}
   	return parent[node]=findpar(parent[node]);
   }
   public static void union(int u,int v)
   {
     u=findpar(u);
     v=findpar(v);
     if(rank[u]<rank[v])
     {
     	parent[u]=v;
     }
     else if(rank[v]<rank[u])
     {
     	parent[v]=u;
     }
     else{
     	parent[v]=u;
     	rank[u]++;
     }
   }
   public static void main(String[] args)
   {
   	  Scanner scn=new Scanner(System.in);
   	  int t=scn.nextInt();
       int n=8;
       makeSet(n);
     while(t-->0)
     { 
        int u=scn.nextInt();
        int v=scn.nextInt();
        union(u,v);
     }
     if(findpar(2)!=findpar(4))
       {
       	System.out.print("different component");
       }
       else{
       	System.out.print("same component");
      }
   }
}