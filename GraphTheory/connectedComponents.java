import java.util.*;
import java.io.*;
class Graph
{
    int v;
    int count;
    ArrayList<Integer> al[];
    boolean visited[];
    Graph(int v)
    {
        this.v = v;
        al =(ArrayList<Integer>[])new ArrayList[v+1];
        visited = new boolean[v+1];
        for(int i=0;i<v+1;i++)
        al[i] = new ArrayList<Integer>();
    }
    void addEdge(int u,int v)
    {
        al[u].add(v);
        al[v].add(u);
    }
    void dfs(int s)
    {
        visited[s] = true;
        for(int child : al[s])
        {
            if(!visited[child])
            {
                dfs(child);
            }
        }
    }
    void connectedComponents()
    {
        for(int i=1;i<=v;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i);
            }
        }
        System.out.println(count);
    }
}
class Solution
{
    public static void main(String  []args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int nm[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Graph g = new Graph(nm[0]);
        for(int i=0;i<nm[1];i++)
        {
            int uv[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            g.addEdge(uv[0],uv[1]);
        }
        g.connectedComponents();
        br.close();
        bw.close();
    }
}
