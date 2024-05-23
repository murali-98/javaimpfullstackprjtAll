package stringprograms;
import java.io.*;
import java.util.*;


public class MaxSeperation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         int K = Integer.parseInt(br.readLine().trim());
         String[] arr_arr = br.readLine().split(" ");
         int[] arr = new int[N];
         for(int i_arr = 0; i_arr < arr_arr.length; i_arr++)
         {
         	arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
         }

         int out_ = Max(N, K, arr);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int Max(int N, int K, int[] arr){
       // Write your code here
       int result = 0; 
		int even = 0, odd = 0;
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < N - 1; i++) {
			if (arr[i] % 2 == 0)
				even++;
			else
				odd++;
			if (even == odd) {
				list.add(Math.abs(arr[i + 1] - arr[i]));
			}
		}
		Collections.sort(list);
		int total = 0;
		for (int diff : list) {
			total += diff;
			if (total <= K)
				result++;
			else
				break;
		}
       return result; 
       }
       
    }

//do String challange easy pgm in hackerearth//cannibal character
