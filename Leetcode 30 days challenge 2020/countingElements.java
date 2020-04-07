class Solution {
    public int countElements(int[] arr) {
        int count[] = new int[1001];
        for(int ele : arr)
        {
            count[ele]++;
        }
        int c=0;
        for(int i=0;i<1000;i++)
        {
            if(count[i]!=0&&count[i+1]!=0)
            {
                c+=count[i];
            }
        }
        return c;
        
    }
}