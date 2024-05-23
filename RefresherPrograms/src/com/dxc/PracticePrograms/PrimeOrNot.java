package com.dxc.PracticePrograms;
import java.util.*;
public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num to check whether it is prime or not");
		int num=sc.nextInt();
		boolean flag=true;
		if(num==0 || num==1) {
			System.out.println(num+"is not Prime number");
		}else {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
			
		}
		
		if(flag==true) {
			System.out.println("The given number " +num+" is Prime number");
		}
		else {
		System.out.println("The given number " +num+" is  not Prime number");
		}
		}
				
		

	}

}
