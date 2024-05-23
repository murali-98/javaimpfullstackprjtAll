package com.dxc.PracticePrograms;

public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
String s1="MaDam";
//System.out.println(s1);
s1=s1.toLowerCase();
//System.out.println(s1);
char[] c=s1.toCharArray();
String s2="";
for(int i=c.length-1;i>=0;i--)
{
s2=s2+c[i];
}
if(s1.equals(s2))
{
	System.out.println("The String is palindrome");
}
else
{
	System.out.println("The String is not palindrome");
}
	


	}

}
