import java.io.*;
import java.util.*;
class index1
{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
int s=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);

for(int i=0;i<n;i++)
{
if(i==a[i])
{
System.out.println(i);
s=s+1;
}
}
if(s==0)
System.out.println("there is no similar element in array to the index");

}
}
