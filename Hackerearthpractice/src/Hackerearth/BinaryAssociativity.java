package Hackerearth;

import java.util.*;

class BinaryAssociativity {

	public static void main(String args[]) throws Exception

	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t != 0) {
			int[][] ar = new int[4][4];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					ar[i][j] = sc.nextInt();
				}
			}
			int temp1[] = new int[8];
			int temp2[] = new int[8];
			for (int i = 0; i < 8; i++) {
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						for (int z = 0; z < 2; z++) {
							temp1[i] = ar[ar[x][y]][z];
							i++;
						}
					}
				}
			}
			for (int i = 0; i < 8; i++) {
				for (int x = 0; x < 2; x++) {
					for (int y = 0; y < 2; y++) {
						for (int z = 0; z < 2; z++) {
							temp2[i] = ar[x][ar[y][z]];
							i++;
						}
					}
				}
			}
			boolean flag = false;
			for (int i = 0; i < 8; i++) {
				if (temp1[i] != temp2[i]) {
					flag = true;
					break;
				}
			}
			if (flag)
				System.out.println("No");
			else
				System.out.println("Yes");
			t--;
		}
	}
}