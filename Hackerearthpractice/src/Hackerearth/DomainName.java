package Hackerearth;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class DomainName {
	public static String solve(String str)     {    
		String regex = "^((?!-)[A-Za-z0-9-]" + "{1,63}(?<!-)\\.)"
	+ "+[A-Za-z]{2,6}"; 
		
		Pattern p = Pattern.compile(regex);
		if (str == null) { 
			return "false";   
			}
		Matcher m = p.matcher(str);
		if(m.matches()) 
			return "true";
		return "false"; 
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String[] s=new String[a];
		for(int i=0;i<=s.length-1;i++)
		{
			s[i]=sc.nextLine();
			DomainName.solve(s);
		}
	
		
  }
}

	
