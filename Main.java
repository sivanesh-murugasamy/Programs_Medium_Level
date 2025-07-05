//MAX SUM OF N CONSECUTIVE ELEMENTS

import java.util.*;
public class Main
{
    public static int sum(int arr[],int n)
    {
        int win=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            win+=arr[i];
        }
        max=win;
        
        for(int i=n;i<arr.length;i++)
        {
           win+=arr[i]-arr[i-n];
           max=Math.max(max,win);
        }
        return max;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]={22,2,3,4,5,6};
		System.out.print(sum(arr,n));
	}
}
