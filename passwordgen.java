import java.io.*;
import java.util.*;
class passwordgen
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String fname=sc.next();
        String lname=sc.next();
        String pin=sc.next();
        int n=sc.nextInt();
        String a[]={fname,lname};
        Arrays.sort(a);
        ArrayList<String> al1=new ArrayList<String>();
        ArrayList<String> al2=new ArrayList<String>();
       
        for(int i=0;i<fname.length();i++)
        {
            char c=fname.charAt(i);
            al1.add(Character.toString(c));
        }
        for(int i=0;i<lname.length();i++)
        {
            char c=lname.charAt(i);
            al2.add(Character.toString(c));
        }
        Collections.sort(al1);
        Collections.sort(al2);
        String max="",du="";
        String min="";
        if(al1.size()>al2.size())
        {
        max=fname;
        min=lname;
        }
        else if(al1.size()<al2.size())
        {
        max=lname;
        min=fname;
        }
        else if(al1.size()==al2.size())
        {
            min=a[0];
            max=a[1];
        }
        du=Character.toString(max.charAt(0))+""+min;
        for(int i=0;i<du.length();i++)
        {
            if(Character.isLowerCase(du.charAt(i)))
                System.out.print((Character.toString(du.charAt(i))).toUpperCase());
            else
                System.out.print((Character.toString(du.charAt(i))).toLowerCase());
        }
        System.out.print(pin.charAt(n-1));
        System.out.print(pin.charAt(pin.length()-n));
        
    }
}


