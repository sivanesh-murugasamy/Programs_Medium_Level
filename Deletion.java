import java.util.*;

public class Deletion
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[]={11,22,33,44,55,66};
    System.out.println("The array is "+Arrays.toString(arr));

    System.out.println("Enter the value to delete: ");
    int val=sc.nextInt();
    int pos=0;
     for(int i=0;i<arr.length;i++)
     {
      if(arr[i]==val)
      {
        pos=i;
      }
     }
     
   int arr1[]=new int[arr.length-1];
   for(int i=0;i<pos;i++)
   {
     arr1[i]=arr[i];
   }
    
   
    for(int i=pos;i<arr1.length;i++)
    {
      arr1[i]=arr[i+1];
    }
    
    System.out.println("Array After Deletion"+Arrays.toString(arr1));
    
  }
}