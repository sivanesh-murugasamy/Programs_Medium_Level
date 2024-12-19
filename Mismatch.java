import java.util.*;

public class Mismatch
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
   
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    { 
      arr[i]=sc.nextInt();
    }

    System.out.println("Enter the size of the array2: ");
    int n1=sc.nextInt();
    int arr1[]=new int[n1];
    for(int i=0;i<n;i++)
    { 
      arr1[i]=sc.nextInt();
    }

    System.out.println(Arrays.mismatch(arr,arr1));


}
}