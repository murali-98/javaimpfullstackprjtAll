package DataStructure;
import java.util.*;
public class Nonemptysubset {
	public static void main(String[] args) {
		// TODO Auto-generatd method stub
Scanner sc = new Scanner(System.in);
int t=sc.nextInt();
for(int j=0;j<t;j++)
{
int n=sc.nextInt(),ans=Integer.MAX_VALUE;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
ans=Math.min(ans,a[i]);
}
System.out.println(ans);

}

	}

}
