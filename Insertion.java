import java.util.*;

class Insertion
{
  public static void main(String argu[])
  {

    Scanner sc=new Scanner(System.in);
    int arr[]={11,22,33,44,55};
    int arr1[]=new int[arr.length+1];
    System.out.println("The array is"+Arrays.toString(arr));
    System.out.println("Enter the position and the value to enter : ");
    int pos=sc.nextInt();
    int newval=sc.nextInt();
    
    for(int i=0;i<pos;i++)
    {
      arr1[i]=arr[i];
    }
    arr1[pos]=newval;
    
    for(int i=pos+1;i<arr.length+1;i++)
    {
      arr1[i]=arr[i-1];
    }
   
    System.out.println("The new array is: "+Arrays.toString(arr1));
    

  }
}