class Solution {
    public int maxSubArray(int[] nums) {
        int result = Integer.MIN_VALUE;
        int tempresult = 0,count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
                count++;
            tempresult += nums[i];
            if(tempresult<0)
                tempresult = 0;
            result = Math.max(result,tempresult);
        }
        if(count==nums.length){
            int max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++)
            {
                max = Math.max(nums[i],max);
            }
            return max;
        }
        return result;
    }
}