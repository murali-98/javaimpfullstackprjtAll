package stringprograms;
import java.util.*;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		char []arr = str.toCharArray();
		System.out.print(arr[0]);
		for(int i=1;i<arr.length;i++){
		int count=1;
		for(int j=0;j<i;j++){
		    if(arr[i]==arr[j]){
		        count++;
		        break;}
		}
		if(count==1)
		System.out.print(arr[i]);
		}
	}
}

