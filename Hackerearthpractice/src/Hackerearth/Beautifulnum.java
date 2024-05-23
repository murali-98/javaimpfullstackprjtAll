package Hackerearth;
import java.util.*;

public class Beautifulnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc =new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while(t >0){
            long x=sc.nextLong();
            long k=sc.nextLong();
            boolean flag =true;
            while(x >0){
                if(x % k >=2){
                    flag =false;
                    break;
                }else{
                    x = x / k;
                }
            }
            if(flag ==true){
                System.out.println("YES");
            }else{

                System.out.println("NO");
            }
            t--;
        }
        sc.close();
	}

}
