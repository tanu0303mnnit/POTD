/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int)(n)];
            long b[] = new long[(int)(n)];
            
            
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            String inputLine1[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(inputLine1[i]);
            }
            
            
            Solution obj = new Solution();
            System.out.println(obj.minTime(a, b, n));
        }
	}
}

// } Driver Code Ends


//User function Template for Java

class Solution 
{

    public long minTime(long a[], long b[], long n) 
    {
        long suma=0,sumb=0,x,y;
   for(int i=0;i<n;i=i+2)
    {
        
        if(i+1>=n)
        {
           x=0;
           y=0;
        }
        else
        {
        x=b[i+1];
        y=a[i+1];
        }
        suma=suma+a[i]+x;
        sumb=sumb+b[i]+y;
    }   
    if(suma<sumb)
    {
       return suma; 
    }
    else
    {
        return sumb;
    }
    }
}