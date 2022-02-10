
// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class PotdDay32
{
    public static void main(String args[])throws IOException
        {
            BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while(t-->0)
                {
                    String arr[] = br.readLine().split(" ");
                    String A = arr[0];
                    String B = arr[1];
                    Solution obj = new Solution();
                    System.out.println(obj.transfigure (A, B));
                }
        }
}// } Driver Code Ends


//User function Template for Java

class Solution
{
    int transfigure (String A, String B)
    {
        if(A.length()!=B.length())
        return -1;
        int sum=0;
        for(char ch:A.toCharArray())
        sum+=ch;
        for(char ch:B.toCharArray())
        sum-=ch;
        if(sum!=0)
        return -1;
        int add=0,j=B.length()-1;
        for(int i=A.length()-1;i>=0;i--)
        {
            if(A.charAt(i)==B.charAt(j))
            {
                j--;
            }
            else
            {
                add++;
            }
        }
        return add;
       // Your code goes here.
    }
}