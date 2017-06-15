import java.io.*;
import java.util.*;
class commonprefix
{
    public static void main(String args[])
    {   
       Scanner sc=new Scanner(System.in);
       String s1=sc.nextLine();
       String me[]=s1.split(",");
       String minvar=new String();
       String sub=new String();
       int count=0;
       int min=me[0].length();
       for(int i=0;i<me.length;i++)
       { 
           if(me[i].length()<min)
           {
               min=me[i].length();
               minvar=me[i];
           }
           else
           {
               minvar=me[0];
           }
       }
       for(int ma=0;ma<me.length;ma++)
       
     { if(me[ma].startsWith(minvar))
      {
          count=1;
      }
      else
      {
          sub=minvar.substring(0,min-1);
          minvar=sub;
      }}if(count==1)
      {
          System.out.print("longest prefix="+minvar);
      }
      
   if(count==0)
      {
          System.out.print("no common prefix");
      }
     
      
    }
}
