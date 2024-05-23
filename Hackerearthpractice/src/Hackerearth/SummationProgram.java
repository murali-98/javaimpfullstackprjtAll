package Hackerearth;
import java.util.*;
public class SummationProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int t; 
		 t = Integer.parseInt(sc.next());
		 while ((t--) != 0)
		 {
		  long n;
		  long value = 1;
		  long sum = 0;
		  long i;
		  long j;
		  long z;
		  n = Long.parseLong(sc.next());
		  while (true)
		  {
		   i = n / value;
		   j = (n / (value + 1)) + 1;
		   if (i == j) {
		    break;
		   }
		   sum += (i - j + 1) * value;
		   value++;
		  }
		  z = n / value;
		  while ((z--) != 0)

		  {
		   sum += n / (z + 1);
		  }
		  System.out.print(sum);
		  System.out.print("\n");
		 }
		 sc.close();

	}

}
