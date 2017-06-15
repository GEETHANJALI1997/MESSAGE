import java.io.*;
import java.util.*;
class leastnodelkdigit
{
public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String inp=sc.nextLine();
      int k=sc.nextInt();
      String h[]=inp.split(" ");
      int ar[]=new int[h.length];
       for(int i=0;i<ar.length;i++)
      {
         ar[i]=Integer.parseInt(h[i]); 
      }  Arrays.sort(ar);
      for(int j=0;j<ar.length-k;j++)
      {
          System.out.print(ar[j]);
      }
    }
}
