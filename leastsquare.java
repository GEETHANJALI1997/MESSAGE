import java.io.*;
import java.util.*;
class leastsquare
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        ArrayList<Integer> al=new ArrayList<Integer>();
        ArrayList<Integer> mi=new ArrayList<Integer>();
        ArrayList<Integer> ma=new ArrayList<Integer>();
        char ch[]=inp.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
        if(Character.isDigit(ch[i]))
        {
            al.add(Character.getNumericValue(ch[i]));
        }
        }
        Collections.sort(al);
        int min=al.get(0),max=al.get(al.size()-1);
        int sum1=1,sum2=0,a1,b1,res1=0,res2=0;
        for(int i1=0;i1<al.size();i1++)
        {
            int val=al.get(i1);
            mi.add(val+min);
            sum1=sum1*mi.get(i1);
        }
        for(int i2=0;i2<al.size();i2++)
        {
            int val1=al.get(i2);
            ma.add(val1*max);
            sum2=sum2+ma.get(i2);
        }
           while(sum1!=0)
           {
             a1=sum1%10;
             res1=res1+a1;
              sum1=sum1/10;
               if(sum1==0&&res1>=10)
                {
                   sum1=res1;
                   res1=0;
                }
            }
            while(sum2!=0)
           {
             b1=sum2%10;
             res2=res2+b1;
              sum2=sum2/10;
               if(sum2==0&&res2>=10)
                {
                   sum2=res2;
                   res2=0;
                }
            }
        int fin=(res1<res2)?res1:res2;
        System.out.print(fin*fin);
    }
}
