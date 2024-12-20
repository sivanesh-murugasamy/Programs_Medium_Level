import java.util.*;

class BubbleSort
{
  public static void main(String argu[])
  {
   int arr[]={90,22,34,10,29};
   int temp=0;
   int len=arr.length;
   for(int i=0;i<len;i++)
   {
     for(int j=0;j<len;j++)
     {
       if(arr[i]<arr[j])
       {
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
       }
     }
      System.out.println();
     for(int n:arr)
     {
       System.out.print(n+" ");
     }
   }

 
  }

}