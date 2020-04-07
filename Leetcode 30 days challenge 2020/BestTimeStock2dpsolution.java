/*
   Memory limit exceeded in last testcase(201)
*/

class Solution {
    public int solve(int index,int type,int ele,int A[],int dp[][][])
    {
        if(index == A.length)
            return 0;
        if(dp[index][type][ele]!=-1)
            return dp[index][type][ele];
        if(type == 0)
        {
            dp[index][type][ele]=Math.max(solve(index+1,1,0,A,dp)+(A[index]-ele),solve(index+1,0,ele,A,dp));
        }
        else if(type == 1)
        {
            dp[index][type][ele]=Math.max(solve(index+1,0,A[index],A,dp),solve(index+1,1,ele,A,dp));
        }
        else
            dp[index][type][ele]=Math.max(solve(index+1,0,A[index],A,dp),solve(index+1,2,0,A,dp));
        return dp[index][type][ele];
    }
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        for(int x:prices)
        {
            max = Math.max(max,x);
        }
        int dp[][][] = new int[prices.length][3][max+1];
        for(int i=0;i<dp.length;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<max+1;k++)
                    dp[i][j][k]= -1;
            }
        }
        return solve(0,2,0,prices,dp);
    }
}