import java.io.*;
import java.util.*;
class rotarr
{
    public static void main(String args[])
    {
        ArrayList<Integer> al=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
       for(int i=k+1;i<a.length;i++)
        {
          al.add(a[i]);
        }
        for(int i=0;i<k+1;i++)
        {
          al.add(a[i]);
        }
       System.out.print(al);
       
        
    }
}
