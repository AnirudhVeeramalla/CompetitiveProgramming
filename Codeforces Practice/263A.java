import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int A[][] = new int[5][5];
        for(int i=0;i<5;i++)
            A[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int i=0,j=0;
        label:
        for(i=0;i<5;i++)
        {
            for(j=0;j<5;j++)
            {
                if(A[i][j]==1)
                {
                    break label;
                }
            }
        }
        // System.out.println(i+" "+j);
        int ans = Math.abs(i-2)+Math.abs(j-2);
        bw.write(Integer.toString(ans));
        br.close();
        bw.close();
    }
}
