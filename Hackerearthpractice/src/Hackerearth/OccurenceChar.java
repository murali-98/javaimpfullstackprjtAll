package Hackerearth;

import java.util.*; 
class OccurenceChar {
	public static void main(String arg[]) {
		Scanner s=new Scanner (System.in); 
		int t=s.nextInt();
		String a; 
		char b;
		int count=0;
		while(t!=0) {
			a=s.next(); 
			b=s.next().charAt(0); 
			char[] charArray=a.toCharArray();
			for(int i=0;i<a.length();i++) { 
				if(charArray[i]==b) {
					count+=1; 
					}
				} 
			System.out.print(count+"\n");
			count=0;
			t-=1;
			} 
		}
	}
