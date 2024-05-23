package Hackerearth;

import java.util.*;
public class MinimumTransction {
	  public static Scanner in= new Scanner(System.in);
	    public static void main(String args[] ) {
	        int n = in.nextInt();
	        int m = in.nextInt();
	        long[] arr = new long[n];

	        for(int i = 0; i< m;i++){
	            int v = in.nextInt();
	            int u = in.nextInt();
	            long w = in.nextLong();

	            arr[v-1] += w;
	            arr[u-1] -= w;
	        }
	        long minTransection =0;
	        for(int i = 0; i<n; i++){
	            if(arr[i]>=0){
	                minTransection += arr[i];
	            }
	        }
	        System.out.println(minTransection);
}
}
/*
 4 3
1 2 3
1 4 4
2 4 3 
*/