package com.dxc.PracticePrograms;

import java.util.Scanner;

public class Substraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first element:");
		int a=sc.nextInt();
		System.out.println("Enter second element:");
		int b=sc.nextInt();
		int c=a-b;
		System.out.println("The Substraction of " + a + " and " +b +" is : " +c);

	}

}
