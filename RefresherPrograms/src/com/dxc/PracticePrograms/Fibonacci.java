package com.dxc.PracticePrograms;
import java.util.*;

public class Fibonacci {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,b=1,c;
		int sum=1;
		//System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++)
		{
			c=a+b;
			//System.out.print(c+" ");
		//	sum=sum+c;
			a=b;
			b=c;
			sum=a+b;
		}
		System.out.println(sum);
		*/
		  Scanner s = new Scanner(System.in);
		  int t= s.nextInt();
		  int count=0;
		  while(t>0)
		  {
			 int m= s.nextInt();
	        int n= s.nextInt();
	        int fact=1;
	        for(int i=m;i<=n;i++)
	        {
	            fact=fact*i;
	            
	         // System.out.println(fact);
	           int result=fact%10;
	            if(result==0)
	            {
	            	count++;
	            }
	        }   
	      System.out.println(count);
	      t--;
		  }
	}

}
