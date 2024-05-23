/*import java.lang.*;
import java.io.*;
import java.util.*;
public class DomainName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        String original,reverse="";
        Scanner s = new Scanner(System.in);
        original=s.nextLine().toLowerCase();
       
        for(int i=original.length()-1;i>=0;i--)
        {
            reverse=reverse+original.charAt(i);
        }
        if(original.equals(reverse))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }



	}

}
*/
/*import java.io.*;
import java.util.*;


public class DomainName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
         int N = Integer.parseInt(br.readLine().trim());
         String[] arr_workload = br.readLine().split(" ");
         int[] workload = new int[N];
         for(int i_workload = 0; i_workload < arr_workload.length; i_workload++)
         {
         	workload[i_workload] = Integer.parseInt(arr_workload[i_workload]);
         }

         int out_ = solve(N, workload);
         System.out.println(out_);

         wr.close();
         br.close();
    }
    static int solve(int N, int[] workload){
       // Write your code here
        int result = 0;
      //  int solve (int N, vector<int> workload) { vector<int>::iterator workloadItr; int longestInterval = 0; int workLoadIntervalCounter = 0; for(workloadItr = workload.begin(); workloadItr != workload.end(); workloadItr++) { if(*workloadItr > 6) { workLoadIntervalCounter++; } else { if(workLoadIntervalCounter> longestInterval) { longestInterval = workLoadIntervalCounter; } workLoadIntervalCounter= 0; } } return longestInterval; }
       for(int i=0;i<=workload.length-1;i++)
    	   if(workload[i]>N)
    	   {
    		   result=result+1;
    	   }
        return result;
    
    }
}



import java.util.*;
import java.lang.*;
import java.io.*;
class Alpha{
	int ns;
	static int s;
	Alpha(int ns)
	{
		if(s<ns)
		{
			s=ns;
			this.ns=ns;
		}
	}
		public void doPrint()
		{
			System.out.println("ns="+ns +"s="+s);
		}
	}
public class DomainName {
	
    public static void main(String[] args) throws IOException {
    	{
    	Alpha ref1=new Alpha(50);
    	Alpha ref2=new Alpha(125);
    	Alpha ref3=new Alpha(100);
    	ref1.doPrint();
    	ref2.doPrint();
    	ref3.doPrint();
    	
    	}
    }
}

*/

import java.util.*;
import java.lang.*;
import java.io.*;
public class TestClass {
	
    public static void main(String[] args) throws IOException {
    	{
    		String[] fruit= {"murali","apple","orange"};
    		System.out.println(fruit.length);
    		System.out.println(fruit[1].length());
    		String str1="murali";
    		System.out.println(str1.length());
    		
    		
    		
    		
    	}
    }
    	}