import java.util.*;
import java.io.*;
public class Solution
{
    static public int maxPoints(int index,int time,int noOfstories,int[] times,int[] points,int dp[][][])
    {
        if(index<0||time<0||noOfstories<0)
        return 0;
        if(dp[index][time][noOfstories]!=-1)
        return dp[index][time][noOfstories];
        int include = maxPoints(index-1,time-times[index],noOfstories-1,times,points,dp)+points[index];
        int exclude = maxPoints(index-1,time,noOfstories,times,points,dp);
        dp[index][time][noOfstories]=Math.max(include,exclude);
        return dp[index][time][noOfstories];
    }
    public static void main(String []args)
    {
        Scanner S=new Scanner(System.in);
        int n=S.nextInt();
        int stories = S.nextInt();
        int m=S.nextInt();
        int times[]=new int[n];
        int points[]=new int[n];
        for(int i=0;i<n;i++)
        times[i]=S.nextInt();
        for(int i=0;i<n;i++)
        points[i]=S.nextInt();
        int dp[][][]=new int[n][m][stories];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                for(int k=0;k<stories;k++)
                dp[i][j][k]=-1;
            }
        }
        maxPoints(n-1,m-1,stories-1,times,points,dp);
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<stories;j++)
            {
                ans=Math.max(ans,dp[n-1][i][j]);
            }
        }
        System.out.println(ans);
    }
}