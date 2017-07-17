import java.io.*;
import java.util.*;
class squareornot
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.print("enter the four points"+"\n");
       int x[]=new int[4];
       int y[]=new int[4];
       for(int i1=0;i1<4;i1++)
       {
           x[i1]=sc.nextInt();
           y[i1]=sc.nextInt();
       }
       if(x[0]==x[3]&&x[1]==x[2]&&y[0]==y[1]&&y[2]==y[3])
               System.out.print("square");
           else
               System.out.print("not a square");
      
    }
}
