/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
    public void rotate(int n,int d,int[] b)
    {
     int[] c = new int[n];
    for(int i=d;i<n;i++)
    {
    
        c[i-d]=b[i];
    }
   for(int i=0;i<d;i++)
    {
        c[(n-d)+i]=b[i];
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(c[i]);
      System.out.print(" ");
    } 
    }
	public static void main(String[] args) 
	{
      Scanner sc=new Scanner(System.in);
      Main obj = new Main();
      int t;
      t=sc.nextInt();
      while(t>0)
      {
        int n,d;
    n=sc.nextInt();
    d=sc.nextInt();
    int[] a= new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
   obj.rotate(n,d,a);
    t--;
    System.out.println();
      }
	}
}
