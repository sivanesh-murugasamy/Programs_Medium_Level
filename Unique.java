import java.util.*;

class Unique
{
  public static void main(String argu[])
  {
   String s="sabbu";
   int count=0; 
   char[] arr=s.toCharArray();
   for(int i=0;i<s.length();i++)
   {
     for(int j=0;j<s.length();j++)
     {
       if(arr[i]!=arr[j])
       {
         count=i;
         break;
       }
     }
   }
   System.out.print(count);
  }
}