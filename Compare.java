import java.util.*;

public class Compare
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the size of the array: ");
    int n=sc.nextInt();
    System.out.println("Enter the elements of first array: ");
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
  
    System.out.println("Enter the size of the array: ");
    int n1=sc.nextInt();
    int[] arr1=new int[n1];
    System.out.println("Enter the elements of first array: ");
    for(int i=0;i<n1;i++)
    {
      arr1[i]=sc.nextInt();
    }
    int result=Arrays.compare(arr,arr1);
    System.out.println(result);

  }
}