package com.dxc.PracticePrograms;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no of test cases");
		int t=sc.nextInt();
		while(t-->0) {
			
		
		int n=sc.nextInt();
		int ans=(int)Math.sqrt(n);
		System.out.println(ans);
		
		}

	}

}
