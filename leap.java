import java.io.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in); 
int y=sc.nextInt();
if(y%4==0)
System.out.print("leap");
else
System.out.print("not a leap");
}
}
