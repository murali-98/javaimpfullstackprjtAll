package Hackerearth;
import java.util.*;

class Stringmadeof {

public static void main(String args[] ) throws Exception {

Scanner sc = new Scanner(System.in);

String s=sc.next();

int sum=0;

for(int i=0;i<s.length();i++)

{

	char ch=s.charAt(i);

	if(ch=='0')

		sum+=6;

	else if(ch=='1')

		sum+=2;

	else if(ch=='2')

		sum+=5;

	else if(ch=='3')

		sum+=5;

	else if(ch=='4')

		sum+=4;

	else if(ch=='5')

		sum+=5;

	else if(ch=='6')

		sum+=6;

	else if(ch=='7')

		sum+=3;

	else if(ch=='8')

		sum+=7;

	else

		sum+=6;

 }

	System.out.println(sum);
}

}
