package Hackerearth;
import java.util.Scanner;
public class CompleteString{
	 public static boolean checkAllAphabets(String s)
	 {
		 if(s.length()<26)
		 {
			 return false;
		 }
		 for(char ch='a';ch<='z';ch++)
		 {
			 if(s.indexOf(ch)<0)
					 {
				 return false;
					 }
		 }
		 return true;
		 
	 }

	    public static void main(String args[] ) throws Exception {
	        
	        System.out.println("Enter  a String");
	        Scanner sc=new Scanner(System.in);
	        String s=sc.nextLine().toLowerCase().trim();
	        CompleteString t=new CompleteString();
	        
	        if(t.checkAllAphabets(s))
	        {
	            System.out.println("yes");
	        }
	        else
	        {
	            System.out.println("no");
	        }
	        


	    }
}

 