import java.io.*;
import java.util.*;
class primecount
{
    public static void main(String args[])
    {   int count=0;
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++)
        {
        if(i%2!=0&&i%3!=0&&i%5!=0&&i%7!=0||i==2||i==3||i==5&&i!=1)
        {
        count=count+1;
        }
}
          System.out.print(count);
    }
}
