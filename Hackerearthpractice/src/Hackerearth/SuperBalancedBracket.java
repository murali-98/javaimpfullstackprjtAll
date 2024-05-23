package Hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SuperBalancedBracket {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 int t = Integer.parseInt(br.readLine());
		 while (t-->0) {
		 String s = br.readLine();
		 int n = s.length();
		 int m= n/2;
		 int open_count = 0;
		 for (int i=0;i<m;i++) {
		 if (s.charAt(i) == '(')
		 open_count++;
		 }
		 System.out.println(open_count*2);
		 }

	}

}
