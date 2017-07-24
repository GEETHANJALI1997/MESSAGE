import java.io.*;
import java.util.*;
class hunter_40
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        ArrayList<Integer> al=new ArrayList<Integer>();
        for(int i=0;i<s.length();i++)
        {
            al.add(Character.getNumericValue(s.charAt(i)));
        }
        int sum=0;
        for(int i=0;i<al.size();i++)
        {
            sum=sum+al.get(i);
        }
        String s1=Integer.toString(sum);
        StringBuffer sb=new StringBuffer(s1);
        StringBuffer sb1=sb.reverse();
        String s2=sb1.toString();
        if(s1.equals(s2))
        System.out.print("palindrome");
        else
        System.out.print("not a palindrome");

}
}
