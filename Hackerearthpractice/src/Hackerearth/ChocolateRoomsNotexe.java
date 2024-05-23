package Hackerearth;
import java.io.*;
import java.util.*;
 
 
public class ChocolateRoomsNotexe{
public static void main(String[] args) throws IOException {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter wr = new PrintWriter(System.out);
int T = Integer.parseInt(br.readLine().trim());
for (int t_i = 0; t_i < T; t_i++) {
String[] temp = br.readLine().split(" ");
int N = Integer.parseInt(temp[0]);
int K = Integer.parseInt(temp[1]);
int MAXSIZE = 105;
String[][] chocolates = new String[MAXSIZE][MAXSIZE];
int[] p = new int[MAXSIZE];
for (int i = 0; i < N; i++) {
String[] arr_chocolates = br.readLine().split(" ");
p[i] = Integer.parseInt(arr_chocolates[0]);
for (int j = 0; j < p[i]; j++) {
chocolates[i][j] = arr_chocolates[j + 1];
}
}
String out_ = solve(N, K, p, chocolates);
wr.println(out_);
}
wr.close();
br.close();
}
static String solve(int N, int K, int[] p, String[][] chocolates) {
// //write your code here
 
HashSet<String> set = new HashSet<String>();
for(int i=0;i<N;i++)
{
for(int j=0;j<p[i];j++)
{
set.add(chocolates[i][j]);
}
}
 
return set.size()>=K?"Yes":"No";
 
}
}

/*1
3 2
1 KITKAT
2 FIVESTAR KITKAT
1 KITKAT
*/