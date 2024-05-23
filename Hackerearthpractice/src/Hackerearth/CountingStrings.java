package Hackerearth;

	import java.util.Scanner;
	class CountingStrings {
		public static void main(String args[] ) throws Exception {
			Scanner input = new Scanner(System.in);  
			int t = input.nextInt();  
			while(t-- >0){  
				String str = input.next();
				long count= 0 , len = str.length() ;
				int temp= 0;
				for(int i =0 ;i<len ; i++){
					if(str.charAt(i)=='a' || str.charAt(i)=='z'){
						count+= len-i; 
						if(true){   
							count+= (len-i)*temp;
						   temp= 0 ;
							}
						}
					else{
						temp++;
						}  
					} 
				System.out.println(count);  
				}
			}
		}
	/*
	4
abcd
azazaz
abbzbba
flkjdh
	 */

