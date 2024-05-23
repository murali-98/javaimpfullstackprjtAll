package Hackerearth;

import java.util.*;

public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n=s.nextInt();
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		Set <Integer> set=new HashSet<Integer>();
		for(int i=0;i<n;i++){
		int num=s.nextInt();
		set.add(num);
		min = Math.min(min, num);
		max = Math.max(max, num);

		}
		boolean flag=true;
		for(int j=min+1;j<max;j++){
		if(!set.contains(j)){
		flag=false;
		break;
		}

	}

		String ss=(flag== true) ? "YES" : "NO";

		System.out.println(ss);
	}

}
