package Hackerearth;

import java.io.*;
import java.lang.*;

public class PepperAndContigiousArray {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		for (int t_i = 0; t_i < T; t_i++)
		{
			int N = Integer.parseInt(br.readLine().trim());
			String[] inp = br.readLine().split(" ");
			int[] A = new int[N];
			for (int i = 0; i < N; i++)
			{
				A[i] = Integer.parseInt(inp[i]);
			}
			int ans = solve(N, A);
			System.out.println(ans);
		}
	}
	static int solve(int N, int[] A) {
		int ans = 0;
		int c = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] % 2 == 0)
			{
				c++;
				if (ans < c)
					ans = c;
			}
			else
				c = 0;
		}
		if (ans == 0)
			ans = -1;
		return ans;
	}
}