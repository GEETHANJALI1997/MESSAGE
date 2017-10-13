import java.util.*;
import java.io.*;
class Hunter_43
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next().toLowerCase();
        ArrayList<Character> chars=new ArrayList <Character>();
        for(int i=0;i<str1.length();i++)
        {
         char a=str1.charAt(i);
         if(Character.isLetter(a))
         {
            String s1=Character.toString(a);
            chars.add(a);
             str1=str1.replace(s1," ");
         }
            
        }
        String str2=str1.trim();
          String arr[]=str2.split(" ");
          int arr1[]=new int[arr.length];
         for(int i=0;i<arr.length;i++)
         arr1[i]=Integer.parseInt(arr[i]);
         int count=0;
         while(count<arr1.length)
         {
             for(int i=0;i<arr1[count];i++)
             System.out.print(chars.get(count));
             count=count+1;
         }
    }
}


