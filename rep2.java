import java.io.*;
import java.util.*;
class rep2
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
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
if(a[i]==a[j])
{ s=1;
System.out.println(a[i]);
}
}
}
if(s==0)
{
System.out.println("no repeatable elements");
}
}
}
