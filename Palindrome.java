class Solution {
    public boolean isPalindrome(int x) 
    {
        int n=x,r,s=0;
        boolean v;
       while(x>0)
       {
           r=x%10;
           s=s*10+r; 
           x=x/10;
       }
        if(s==n)
          v=true;
        else 
        v=false;
        return v;
    }
}