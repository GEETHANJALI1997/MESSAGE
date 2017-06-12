import java.io.*;
import java.util.*;
class redigit
{
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int a=0;
     while(n!=0)
     {
        a=n%10;
        n=n/10;
     System.out.print(a);
    }
    }
}
