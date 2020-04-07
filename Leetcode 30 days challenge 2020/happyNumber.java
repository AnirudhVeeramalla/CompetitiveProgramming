class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<Integer>();
        hs.add(n);
        while(n!=1)
        {
            int x=n;
            int temp=0;
            while(x!=0){
                int digit=x%10;
               temp=temp+digit*digit;
               x=x/10;
            }
            n=temp;
            if(hs.contains(n)==true)
                return false;
            hs.add(n);
        }
        return n==1;
    }
}