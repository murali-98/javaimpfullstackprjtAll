package com.dxc.PracticePrograms;

/*public class ReverArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[] {1,2,3,4,5};
System.out.println("Original Array");
for(int i=0;i<=arr.length-1;i++)
{
	System.out.print(arr[i] +" ");
}
System.out.println();
System.out.println("Array in reverse order");
for(int i=arr.length-1;i>=0;i--)
{
	System.out.print(arr[i] +" ");
}
			


}
}
*/
import java.io.*;

import java.util.*;

public class ReverArray {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		String[] arr_arr = br.readLine().split(" ");
		int[] arr = new int[n];
		Stack<Integer> stack1 = new Stack<>();
		Stack<Integer> stack2 = new Stack<>();
		// considering 3 2 1 as ascending since poping of value will start from 1
		// descending ordering of stack 1 2 3
		for (int i_arr = 0; i_arr < arr_arr.length; i_arr++) {
			arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
			stack2.push(arr[i_arr]);
		} // ascending ordering of stack 3 2 1
		for (int i = arr.length - 1; i >= 0; i--) {
			stack1.push(arr[i]);
		}
		while (!stack1.isEmpty() && !stack2.isEmpty()) {
			if (stack1.peek() > stack2.peek()) {
				stack2.pop();
				System.out.print("1" + " ");
			} else if (stack1.peek() < stack2.peek()) {
				stack1.pop();
				System.out.print("2" + " ");
			} else {
				stack1.pop();
				stack2.pop();
				System.out.print("0" + " ");
			}
		}
		wr.close();
		br.close();
	}
}
