import java.util.*;
import java.io.*;
class Solution
{
    public static void main(String []args)throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int i=0;i<n;i++)
            al.add(Integer.parseInt(br.readLine()));
        int result = 0;
        for(int i=31;i>=0;i--)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            for(int j=0;j<al.size();j++)
            {
                if(((al.get(j)>>i)&1)==1)
                temp.add(al.get(j));
            }
            if(temp.size()>=2)
            {
                result += (1<<i);
                al = temp;
            }
        }
        bw.write(Integer.toString(result));
        br.close();
        bw.close();
    }
}
