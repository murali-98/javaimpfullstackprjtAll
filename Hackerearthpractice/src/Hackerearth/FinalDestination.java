package Hackerearth;
import java.util.*;
public class FinalDestination {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String str=s.next();  int x=0,y=0;

		for(int i=0;i<str.length();i++)

		{
			char ch=str.charAt(i);

		switch(ch)

		{case 'L':  x=x-1;  break;

		case 'R': x=x+1;  break;

		case 'U':  y=y+1;  break;

		case 'D':  y=y-1;  break;

		}
	}

		System.out.println(x+" "+y);
	}

}
