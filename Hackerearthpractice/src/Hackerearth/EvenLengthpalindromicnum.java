package Hackerearth;
import java.util.*;
import java.io.*;

public class EvenLengthpalindromicnum {
 public static void main(String[] args)throws Exception{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      int max=0;

      int index=0;

      
      int T=Integer.parseInt(br.readLine());

      for(int i=1;i<=T;i++)

      {

          String s=br.readLine();

          for(int j=0;j<=9;j++)

          {

              String s1 = Integer.toString(j);

              int z= (s.length() - s.replaceAll(s1,"").length())*2;  

              if(z>max){max=z; index=j;}  

          }

        System.out.println(index);

        index=0;

        max=0;

      }

}

}