/*
    http://codeforces.com/problemset/problem/69/A
*/
import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int A[][] = new int[n][3];
        for(int i=0;i<n;i++)
            A[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean flag = true;
        for(int i=0;i<3;i++)
        {
            int sum = 0;
            for(int j=0;j<n;j++)
            {
                sum+=A[j][i];
            }
            if(sum!=0)
            {
                flag=false;
                break;
            }
        }
        if(flag)
        bw.write("YES");
        else
        bw.write("NO");
        br.close();
        bw.close();
    }
}
