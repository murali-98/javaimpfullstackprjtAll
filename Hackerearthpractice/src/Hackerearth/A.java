package Hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 class A { 
	 public static void main(String [] args) {
		 Scanner input = new Scanner(System.in);
		 int t = input.nextInt(); 
		 for (int i = 1; i <= t; i++) { 
			 int n = input.nextInt(); 
			 int m = input.nextInt();
			 int []arr = new int[m]; 
			 for (int j = 0; j < m; j++) {
				 arr[j] = input.nextInt();
				 } 
			 Arrays.sort(arr);
				 
				 int sum=0,
						 k=0;
				 for (int j = 0; j < m; j++) {
					 if(n>=sum+arr[j]) {
						 sum=sum+arr[j];
						 k++;
						 
					 }
					 
				 }
				 System.out.println(k);
				 }
		 }
	 }
 /*
  2
10 4
3 9 4 2
5 6
3 2 1 1 2 1*/
