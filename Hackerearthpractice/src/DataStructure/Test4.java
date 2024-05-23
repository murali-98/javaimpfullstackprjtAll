package DataStructure;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
       
    	 Scanner sc = new Scanner(System.in);
 		int N= sc.nextInt();
 		int K = sc.nextInt();
 		//System.out.println(maxnumber(n, k));
        System.out.println(removeKDigits(N, K));
    }

    public static int removeKDigits(int num, int k) {
        String numStr = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        int index = 0;
        while (index < numStr.length() && k > 0) {
            if (index == numStr.length() - 1 || numStr.charAt(index) >= numStr.charAt(index + 1)) {
                index++;
            } else {
                numStr = numStr.substring(0, index) + numStr.substring(index + 1);
                k--;
                index = Math.max(0, index - 1);
            }
        }

        // Append remaining digits
        result.append(numStr.substring(0, numStr.length() - k));

        return Integer.parseInt(result.toString());
    }
}

