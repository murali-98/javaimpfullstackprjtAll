package Hackerearth;
import java.util.*;

public class DistributeChocolate {
	public static void main(String[] args) throws Exception{

		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		for(int i=0;i<tc;i++){
		long c=sc.nextLong();
		long n=sc.nextLong();
		long k=c/n;
		long dis=(n*(n+1))/2;
		if(dis>c)
		System.out.println(c);
		else
		System.out.println((c-dis)%n);
		
		}

		}

}
