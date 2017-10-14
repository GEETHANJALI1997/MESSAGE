import java.io.*;
import java.util.*;
class Hunter_55
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         String s1=sc.next();
         String s2=sc.next();
         int n1=Integer.parseInt(s1);
         int n2=Integer.parseInt(s2);
         if(n1>0&&n2>0)
         System.out.print(n1*n2);
         else
         System.out.print("wrong input");
    }
}
