package Hackerearth;
import java.util.*;

class Greatkian {

public static void main(String args[] ) throws Exception {

Scanner in=new Scanner(System.in);

int no=in.nextInt();

long val=0;

long first=0,last=0,mid=0;

for(int i=1;i<=no;i++)
{
	val=in.nextInt();

	if(i%3==1){
	
		first=first+val;}

	if(i%3==2){

		mid=mid+val;}

	if(i%3==0){

		last=last+val;}}

	System.out.print(first+" "+mid+" "+last);}

}