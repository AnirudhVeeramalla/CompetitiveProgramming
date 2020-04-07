/*
    http://codeforces.com/problemset/problem/271/A
*/

import java.util.*;
import java.io.*;
public class Solution
{
    static int noOfdigits(int year)
    {
        HashSet<Integer> hs =new HashSet<Integer>();
        while(year!=0)
        {
            int digit = year%10;
            hs.add(digit);
            year = year/10;
        }
        return hs.size();
    }
    public static void main(String []args)throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        int year = Integer.parseInt(br.readLine());
        for(int curryear = year+1;curryear<10000;curryear++)
        {
            if(noOfdigits(curryear)==4)
            {
                bw.write(Integer.toString(curryear));
                break;
            }
        }
        br.close();
        bw.close();
    }
}
