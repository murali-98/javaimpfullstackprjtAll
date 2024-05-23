package Hackerearth;
import java.util.*;

public class ChallengingTrack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int diff=0,count=0;
		int T=sc.nextInt();
		for(int i=1;i<=T;i++)
		{
		int n=sc.nextInt();
		Long p=sc.nextLong();
		int[] arr = new int[n];
		arr[0]=sc.nextInt();
		p=p-arr[0];
		for(int t=1;t<n;t++)
		{
		arr[t]=sc.nextInt();
		if(arr[t]%2==0){count=t-0;}
		else{count=t-1;}
		diff=arr[t]-count;
		if(diff<=0){p=p-0;}
		else{p=p-diff;}
		}
		if(p>=0)
		{
		System.out.println("Yes"+" "+p);
		}
		else
		{
		System.out.println("No");

		}

		count=0;diff=0;

	}

}
}

/*2
6 21
8 6 1 7 6 5
3 6
5 2 7
 */
