import java.io*;
import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(Sysem.in);
int n=sc.nextInt();
int f=1;
for(int i=0;i<n;i++)
{
f=f*i;
}
System.out.print(f);
}
}
