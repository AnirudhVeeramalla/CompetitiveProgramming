/*
    http://codeforces.com/problemset/problem/32/B
*/

import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine();
        for(int i=0;i<s.length();)
        {
            if(s.charAt(i)=='.')
            {
                bw.write("0");
                i++;
            }
            else if(i+1<s.length() && s.charAt(i)=='-'&&s.charAt(i+1)=='.')
            {
                bw.write("1");
                i+=2;
            }
            else if(i+1<s.length() && s.charAt(i)=='-'&&s.charAt(i+1)=='-')
            {
                    bw.write("2");
                    i+=2;
            }
        }
        br.close();
        bw.close();
    }
}
