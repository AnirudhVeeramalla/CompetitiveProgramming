import java.util.*;
import java.io.*;
class Graph
{
    int v;
    int c=0;
    ArrayList<Integer> []al;
    int count[];
    boolean trees[];
    boolean visited[];
    Graph(int v)
    {
        this.v=v;
        al = (ArrayList<Integer>[])new ArrayList[v+1];
        for(int i=0;i<=v;i++)
        al[i]=new ArrayList<Integer>();
        visited=new boolean[v+1];
        count = new int[v+1];
    }
    void addEdge(int u,int v)
    {
        al[u].add(v);
        al[v].add(u);
    }
    void dfs(int s)
    {
        if(trees[s])
        return;
        visited[s]=true;
        c++;
        for(int v:al[s])
        {
            if(!visited[v])
            {
                dfs(v);
            }
        }
    }
    int getAnswer(boolean []trees)
    {
        this.trees=trees;
        dfs(1);
        return c-1;
    }
}
public class Solution
{
    public static void main(String []args)
    {
        Scanner S = new Scanner(System.in);
        int n=S.nextInt();
        int m=S.nextInt();
        Graph g = new Graph(n);
        for(int i=0;i<n-1;i++)
        {
            int u=S.nextInt();
            int v=S.nextInt();
            g.addEdge(u,v);
        }
        boolean trees[]=new boolean[n+1];
        for(int i=0;i<m;i++)
        trees[S.nextInt()]=true;
        System.out.println(g.getAnswer(trees));
    }
}
