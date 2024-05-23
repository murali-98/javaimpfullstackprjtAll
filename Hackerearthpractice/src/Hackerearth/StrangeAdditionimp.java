package Hackerearth;

import java.io.*;

import java.util.*;

public class StrangeAdditionimp

{

static Scanner sc = new Scanner(System.in);

public static void main(String[] args)

{

 int t = sc.nextInt();

 sc.nextLine();

 while(t-- >0)

  solve();

}

static void solve()

{

 int n1 = sc.nextInt();

 int n2 = sc.nextInt();

 int reverese1 = 0,reverse2 = 0,answer;

 while(n1 != 0)

 {

  int reminder = n1%10;

  reverese1 =reverese1*10+reminder;

  n1 /= 10;

 }

 while(n2 > 0)

 {

  int reminder = n2 % 10;

  reverse2 = reverse2*10+reminder;

  n2 /= 10;

 }

 n1 = reverese1+reverse2;

    reverese1 =0;

 while(n1 != 0)

 {

  int reminder = n1%10;

  reverese1 =reverese1*10+reminder;

  n1 /= 10;

 }

 System.out.println(reverese1);

}

}
//3
//353 575
//238746 39857
//890 231
