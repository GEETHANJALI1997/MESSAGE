import java.util.*;
class completestring
{
    public static void main(String args[])
    {
      
      Scanner sc=new Scanner(System.in);
      String inp=sc.nextLine();
      String me=inp.toLowerCase();
      ArrayList<String> al=new ArrayList<String>();
      ArrayList<String> am=new ArrayList<String>();
      for(char i='a';i<='z';i++)
      {
          al.add(Character.toString(i));
      }
      for(int j=0;j<me.length();j++)
      {
          char  k=me.charAt(j);
          am.add(Character.toString(k));
      }
      if(am.containsAll(al))
      System.out.print("the given string is panagram");
      else
      System.out.print("not a panagram");
      
    }
}
      


