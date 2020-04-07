import java.util.*;
import java.io.*;
class Graph
{
    int v;
    int count;
    ArrayList<Integer> al[];
    boolean visited[];
    Stack<Integer> st;
    Graph(int v)
    {
        this.v = v;
        al =(ArrayList<Integer>[])new ArrayList[v+1];
        visited = new boolean[v+1];
        for(int i=0;i<v+1;i++)
        al[i] = new ArrayList<Integer>();
        st = new Stack<Integer>();
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
        st.push(s);
    }
    void topologicalSort()
    {
        dfs(1);
        while(!st.empty())
            System.out.print(st.pop()+" ");
        System.out.println();
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
        g.topologicalSort();
        br.close();
        bw.close();
    }
}
