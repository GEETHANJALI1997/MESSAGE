import java.io.*;
import java.util.*;
class palindrome
{
    public static void main(String args[])
    {  
        int count=0,maxlen,newlen;
        String val=new String();
     String s1=new String();
     Scanner sc=new Scanner(System.in);
     String str1=sc.next();
     char ch[]=str1.toCharArray();
     String maxx=new String();
     String ar[]=new String[ch.length];
     for(int i=0;i<ch.length;i++)
     {
         for(int j=ch.length-1;j>=0;j--)
         {
             if(i<j)
             {
             if(ch[i]==ch[j])
             {
                 s1=str1.substring(i,j+1);
                StringBuffer h1=new StringBuffer(s1);
                 h1.reverse();
                String h2=new String(h1);
                 
                 if(h2.equals(s1))
                 {
                  ar[count]=s1;
                  count++;
                 }
             }
             }
         }
     }
     
     maxlen=ar[0].length();
     for(int k=0;k<count;k++)
     {
         newlen=ar[k].length();
         if(newlen>=maxlen)
         {
             maxlen=newlen;
          val=ar[k];   
         }
     }
     System.out.print(val);
    }
}
      
