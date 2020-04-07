import java.util.*;
import java.io.*;
class Graph
{
    ArrayList<Integer> []al;
    int intime = 0;
    int v;
    boolean visited[];
    int in[];
    int low[];
    Graph(int v)
    {
        this.v=v;
        al=(ArrayList<Integer>[])new ArrayList[v+1];
        visited = new boolean[v+1];
        in = new int[v+1];
        low = new int[v+1];
        for(int i=0;i<=v;i++)
        {
            al[i]=new ArrayList<Integer>();
        }
    }
    void addEdge(int u,int v)
    {
        al[u].add(v);
        al[v].add(u);
    }
    void articulationPoint(int s,int parent)
    {
        // intime++;
        in[s]=intime;
        low[s]=intime;
        intime++;
        visited[s]=true;
        for(int w:al[s])
        {
            if(parent==w)
            continue;
            if(visited[w])
            {
                low[s] = Math.min(low[s],in[w]);
            }
            else
            {
                articulationPoint(w,s);
                low[s] = Math.min(low[s],low[w]);
                if(low[w]>in[s])
                {
                    System.out.println(s+" "+w);
                }
            }
        }
    }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int nm[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       int A[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
       Graph g = new Graph(nm[0]);
       for(int i=0;i<nm[1];i++)
       {
           int uv[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
           g.addEdge(uv[0],uv[1]);
       }
       g.articulationPoint(1,-1);
       br.close();
       bw.close();
    }
}
