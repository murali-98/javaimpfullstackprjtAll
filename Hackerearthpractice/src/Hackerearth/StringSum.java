package Hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class StringSum {

	public static void main(String[] args)throws Exception {

		 Scanner sc = new Scanner(System.in); 
		 String str = sc.nextLine().toLowerCase(); 
		 int sum=0; 
		 for(int i=0;i<str.length();i++) { 
		  sum+=((int)str.charAt(i)-96); 
		 } 
		 System.out.println(sum); 


	}

}
/*
 * import java.util.*;

class DomainName {

public static void main(String args[] ) throws Exception {

Scanner s = new Scanner(System.in);

String str=s.next();

int len=str.length();

int val=0;

for(int i=0;i<len;i++)

{char c=str.charAt(i);

int k=(int)c;

val=val+(k-96);}

System.out.println(val);

}

}*/
