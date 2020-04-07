/*
    http://codeforces.com/problemset/problem/266/B
*/

import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int nt[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder(br.readLine());
        for(int j=0;j<nt[1];j++){
            for(int i=1;i<nt[0];)
            {
                if(sb.charAt(i)=='G'&&sb.charAt(i-1)=='B')
                {
                    sb.replace(i-1,i,"G");
                    sb.replace(i,i+1,"B");
                    i+=2;
                }
                else
                i++;
            }
        }
        bw.write(sb.toString());
        br.close();
        bw.close();
    }
}