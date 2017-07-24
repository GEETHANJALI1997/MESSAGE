import java.io.*;
import java.util.*;
class happy
{
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int no=sc.nextInt();
      int a,sum=0,b;
      while(no!=0)
      {
          a=no%10;
          no=no/10;
          b=a*a;
          sum=sum+b;
          if(no==0&&sum!=1)
          {
              no=sum;
              sum=0;
          }
          
      }
       System.out.print(sum);
  System.out.print("happy no");
  else 
  System.out.print("not ahappy no");
    }
}
