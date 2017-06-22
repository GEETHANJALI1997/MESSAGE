
import java.io.*;
import java.util.*;
class wordreverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        String a[]=input.split(" ");
        for(int i=0;i<a.length;i++)
        {
            StringBuffer sb=new StringBuffer(a[i]);
            String res=sb.reverse().toString();
            System.out.print(res+" ");
        }
    }
}

