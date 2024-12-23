import java.util.*;

public class binarysearch
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner (System.in);
    int n=sc.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println("Sorted array "+arr);
    System.out.println("Enter the number to search: ");
    int key=sc.nextInt();
    int result=Arrays.binarySearch(numbers,key);
    if(result>=0)
    {
     System.out.println(number+"found at");
    }
    else
    {
     System.out.println(number+"not found");
    }
    
  }

}