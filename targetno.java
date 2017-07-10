import java.io.*;
import java.util.*;
class targetno
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int a[]=new int[args.length];
        int ans;
        for(int i=0;i<args.length;i++)
        {
         a[i]=Integer.parseInt(args[i]);  
        // System.out.println(a[i]);
        }
        for(int i1=0;i1<a.length;i1++)
        {
            for(int j1=0;j1<a.length;j1++)
            {
                if(i1!=j1)
                {
                    ans=a[i1]+a[j1];
                    if(target==ans)
                    {
                        System.out.println(a[i1]+ "and"+ a[j1]);
                        break;
                    }
                 
                }
                
            }
        }
        
    }
}



