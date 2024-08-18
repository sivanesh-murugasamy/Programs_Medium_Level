/******************************************************************************
Missing Numbers in a sequence in java
*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		//Logic
		int asum=0;
		int sum=(n+1)*(n+2)/2;
		
		for(int i=0;i<n;i++)
		{
		    asum+=arr[i];
		}
		
		int val=sum-asum;
		System.out.println("The Missing Value: "+val);
		
	}
}
