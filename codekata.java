import java.io.*;
import java.util.*;
class codekata
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next().toLowerCase();
        String s1=sc.next().toLowerCase();
        int a;
        ArrayList<Character> al1=new ArrayList<Character>();
        for(int i=0;i<s.length();i++)
        {
           a=(int)s.charAt(i)+10;
            if(a>122)
            a=(a-122)+96;
            al1.add((char)a); 
            System.out.print(al1.get(i));
             a=0;
        }
          al1.clear();
           System.out.print(" ");
        for(int i=0;i<s1.length();i++)
        {
            if(i!=0&&i!=s1.length()-1)
            {
            a=(int)s1.charAt(i)+10;
            if(a>122)
            a=(a-122)+96;
            al1.add((char)a);
            }
            else
            {
                al1.add(s1.charAt(i)); 
            }
            System.out.print(al1.get(i));
             a=0;
        }
        
    }
}

