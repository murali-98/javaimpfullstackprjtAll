package Hackerearth;


import java.util.*;
public class GreatestString {
	public static void main(String args[] ) throws Exception {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		for(int i = 0;i<t;i++)
		{
			String str = s.next();
			int q = s.nextInt();
			char[] arr = str.toCharArray();
			for(int j = 0;j<str.length();j++)
			{
				if(q>0){
				char ch = str.charAt(j);
				switch(ch){
				case 'a':arr[j]='b';q--;break;
		
				case 'e':arr[j]='f';q--;break;
		
				case 'i':arr[j]='j';q--;break;
		
				case 'o':arr[j]='p';q--;break;
		
				case 'u':arr[j]='v';q--;break;
				}

		      }

			}
		String str1 = new String(arr);
		System.out.println(str1);
	 }
	}

}
