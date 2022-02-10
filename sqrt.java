class Solution 
{
    public int mySqrt(int x) 
    {
      long low=1,high=x/2;
        int ans=0;
long mid;
    if(x==0 || x==1)
    {
        ans=x;
    }
    else
    {
    while(low<=high)
    {
        mid=low+(high-low)/2;
      
        if(mid*mid==x)
        {
          ans=(int)mid; 
          break;
        }
        else if(mid*mid>x)
        {
          high=mid-1;  
        }
        else if(mid*mid<x)
        {
            low=mid+1;
            ans=(int)mid;  
        }
    }
    }
    return ans;    
    }
}