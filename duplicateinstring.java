import java.io.*;
import java.util.*;
class duplicateinstring
{
    public static void main(String args[])
    {
         Scanner sc=new Scanner(System.in);
         String inp=sc.next();
         Set<Character> s=new LinkedHashSet<Character>();
         for(int i=0;i<inp.length();i++)
         {
             s.add(inp.charAt(i));
         }
         for(char j:s)
         System.out.print(j);
             
    }
}



