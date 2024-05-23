package stringprograms;

import java.util.*;

class Palindromes {

	static boolean isPalindrome(String s)

	{

		int n = s.length();
		//System.out.println("n value is"+n);
		for (int i = 0; i < n / 2; i++)
		{
			if (s.charAt(i) != s.charAt(n - i - 1))
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("enter str_"+n);
		String s = sc.next();
		if (!isPalindrome(s))
			System.out.println(s.length());
		else
		{
			int count = 0;
			for (int i = 0; i < s.length(); i++)
			{
				if (s.charAt(i) == s.charAt(0))
					count++;
			}
			if (count == s.length())
				System.out.println("0");
			else
				System.out.println(s.length() - 1);
		}
	}
}