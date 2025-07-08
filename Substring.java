import java.util.*;
class Substring
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str="";
	    for(int i=0;i<s.length();i++)
	    {
	        char a=s.charAt(i);
	        str=a+str;
	    }
	    if(s.equals(str))
	    {
	        System.out.println("Given String is the substring");
	    }
	    else{
	        System.out.println("Given String is not the substring");
	    }
	
	}
}
