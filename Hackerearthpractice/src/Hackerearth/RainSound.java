package Hackerearth;
import java.util.*;

class RainSound{

public static void main(String args[] ) throws Exception {

	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int j=1;j<=t;j++){
		long l=sc.nextInt();
		long r=sc.nextInt();
		long s=sc.nextInt();
		double min = (double)l/s;
		long max = r/s;
		if(min<=max){
			System.out.println((long)Math.ceil(min)+" "+max);
			}
		if(min>max){

			System.out.println("-1 -1");
		}
	}
   }
}
/*
 3
5 10 3
7 12 4
50 60 1*/
 

