package DataStructure;
import java.util.*;

public class MinimumAdditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		long loop = s.nextInt();
		long N, K, temp = 0, sum = 0;
		int a[] = new int[1000000];
		long res = 0;
		while (loop > 0)
		{
			temp = 0;
			sum = 0;
			N = s.nextInt();
			K = s.nextInt();
			for (int i = 0; i < N; i++)
			{
				a[i] = s.nextInt();
				sum += a[i];
			}
			if (sum / N <= K)
			{
				System.out.println(temp);
			}

		else {

				res = (sum / (K + 1)) + 1;

				System.out.println(res - N);
			}
			loop--;
		}

	}

}
