package DataStructure;
import java.util.*;
public class MinimumOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int [] a=new int[n];
		int elementCount=1;
		int Op=0;
		for(int i=0;i<n;i++)
		{
		a[i]=sc.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
		if(a[i]==a[i+1])
		elementCount++;
		}
		Op=n-elementCount+1;

		System.out.println(Op);

	}

}
