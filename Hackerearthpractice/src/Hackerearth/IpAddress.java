package Hackerearth;

import java.util.*; 
import java.util.Scanner;
import java.util.regex.Pattern;
class IpAddress {
	static String validate(String IP)       {
		String regex="(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
		Pattern p = Pattern.compile(regex);
		if (p.matcher(IP).matches()) 
		{
			return "YES";
		}
		
		else {   
			return "NO";
		}
		}
	public static void main(String args[] ) throws Exception {    
		Scanner s=new Scanner(System.in);    
		String IP = s.next();
		System.out.println(validate(IP));    
		}
	}
