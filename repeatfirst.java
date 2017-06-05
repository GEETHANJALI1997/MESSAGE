import java.io.*;
import java.util.*;
class repeatfirst
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{a[i]=s.nextInt();}
int count=0;
if(n>0)
{
for(int l=0;l<n;l++)
{
for(int j=l+1;j<n;j++)
{
if(a[l]==a[j])
{
count=count+1;
if(count==1)
System.out.println(a[l]);
}}
}}
}}
