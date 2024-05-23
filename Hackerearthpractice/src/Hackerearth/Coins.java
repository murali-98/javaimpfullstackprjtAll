package Hackerearth;
import java.util.Scanner;
public class Coins{
private final int N = (int) (1e5 + 5);
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t;
        t = Integer.parseInt(sc.next());
        while ((t--) != 0) {
            int p;
            int q;
            p = Integer.parseInt(sc.next());
            q = Integer.parseInt(sc.next());
            if (p % 2 == 0 || q % 2 == 0) {
                System.out.println("Ashish");
               // System.out.print(DefineConstants.endl);
            } else {
                System.out.println("Jeel");
                //System.out.print(DefineConstants.endl);
            }
        }
    }
}
 
/*final class DefineConstants

{

    public static final String endl = "\n";

}

}
*/
