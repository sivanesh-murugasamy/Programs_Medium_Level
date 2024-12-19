import java.util.*;

class Builder
{
  public static void main(String argu[])
  {
    Scanner sc=new Scanner (System.in);
    StringBuilder str=new StringBuilder();
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
     arr[i]=sc.nextInt();
    }
    for(int temp:arr)
    {
      str.append(temp);
    }
    String str1=str.toString();
    System.out.println("The Multiplication of number is"+Integer.parseInt(str1)*2);
  }
}