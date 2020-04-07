class Solution {
    public int singleNumber(int[] nums) {
        int x=0;
        for(int temp:nums)
        {
            x^=temp;
        }
        return x;
    }
}