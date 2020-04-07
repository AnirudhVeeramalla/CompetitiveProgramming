import java.util.*;
import java.io.*;
public class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int t=Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++)
        {
            bw.write("Case #"+Integer.toString(i+1)+": ");
            int n=Integer.parseInt(br.readLine());
            StringBuilder result=new StringBuilder("");
            StringBuilder s=new StringBuilder(br.readLine());
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='E')
                result.append('S');
                else
                result.append('E');
            }
            bw.write(result.toString());
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}