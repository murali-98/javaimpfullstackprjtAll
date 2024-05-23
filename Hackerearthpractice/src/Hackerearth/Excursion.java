package Hackerearth;

import java.util.*;

public class Excursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 int room=0;
		 while(T>0)
		 {
		  int N=sc.nextInt();
		  int M=sc.nextInt();
		  int K=sc.nextInt();
		  if(N%K==0 && M%K==0)
		  {
		   room=(N/K)+(M/K);
		  }
		  else if((N%K==0 && M%K!=0) || (N%K!=0 && M%K==0))
		  {
		   room=(N/K)+(M/K)+1;
		  }
		  else
		  {
		   room=(N/K)+(M/K)+2;
		  }
		  System.out.println(room);
		  T--;
		 }
	}

}
/*4
13 7 2
5 5 3
2 2 2
5 4 5
*/