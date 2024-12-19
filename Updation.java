import java.util.*;

public class Updation
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner(System.in);
    int arr[]={11,22,33,44,55,66};
    System.out.println("The array is "+Arrays.toString(arr));

    System.out.println("Enter the value to want to be update: ");
    int val=sc.nextInt();
    int pos=0;
     for(int i=0;i<arr.length;i++)
     {
      if(arr[i]==val)
      {
        pos=i;
      }
     }

    System.out.println("Enter the new value to want to be update: ");
    int newele=sc.nextInt();
    arr[pos]=newele;
    System.out.println("Updated array: "+Arrays.toString(arr));
    
    
    
  }
}