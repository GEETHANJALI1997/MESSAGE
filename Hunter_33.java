import java.io.*;
import java.util.*;
class Hunter_33
{
    public static void main(String args[])
    {
        Scanner c=new Scanner(System.in);
        int no=c.nextInt();
        ArrayList<String> al=new ArrayList<String>();
        al.add("space");
        al.add(" ");
        al.add("abc");
        al.add("def");
        al.add("ghi");
        al.add("jkl");
        al.add("mno");
        al.add("pqrs");
        al.add("tuv");
        al.add("wxyz");
        System.out.print(al.get(no));
    }
}
