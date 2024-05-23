package DataStructure;
import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.util.*;
class Minimumindexes { 
	public static void main(String args[] ) throws Exception { 
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int []arr=new int[size];
		int[]arr2=new int[size];
		int sum=0; int digit;
		int query=sc.nextInt();
		for(int i=0;i<size;i++) { 
			sum=0; 
			arr[i]=sc.nextInt();
			digit=arr[i]; 
			while(digit>0) { 
				sum=sum+digit%10;
				digit=digit/10; 
				} 
			sum=sum+digit;
			arr2[i]=sum; 
			
			}  
		for(int i=0;i<query;i++) {
			System.out.println(greaterindex(sc.nextInt(),arr,arr2)); 
			}
		} 
	public static int greaterindex(int num,int[]arr,int[]arr2) { 
		for(int i=num;i<arr.length;i++) { 
			if((arr[num-1]<arr[i])&&(arr2[num-1]>arr2[i])) { 
				
				return i+1; } } return -1; 
				}
	}
	/*
	 5 5
62 70 28 62 92
1
5
3
4
2	
	 */

	
