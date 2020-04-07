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
            String s=br.readLine();
            String a,b;
            a=b="";
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j)=='4')
                {
                    a+="1";
                    b+="3";
                }
                else
                {
                    a+=s.charAt(j);
                    b+="0";
                }
            }
            int j;
            for(j=0;j<b.length()&&b.charAt(j)=='0';j++);
            StringBuffer sb=new StringBuffer(b);
            sb.replace(0,j,"");
            b=sb.toString();
            bw.write(a+" "+b);
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}