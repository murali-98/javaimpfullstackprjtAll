package Hackerearth;

import java.util.*;

class StringClash {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int ans = 0;
		for (char a = 'a'; a <= 'z'; a++) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == a) {
					count++;
				}
			}
			for (int i = 0; i < t.length(); i++) {
				if (t.charAt(i) == a) {
					count++;
				}
			}
			if (count % 2 != 0)
				ans = ans + count - 1;
			else
				ans = ans + count;
		}
		System.out.println(ans + 1);
	}
}