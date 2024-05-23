package stringprograms;
import java.util.*;

public class String {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int size = Integer.parseInt(s.nextLine());
		char ch[] = s.nextLine().toCharArray();
		Arrays.sort(ch);
		int max = 0;
		for (int i = 0; i < size; i++) {
			int count = 1;
			while (i < size - 1 && ch[i] == ch[i + 1]) {
				count++;
				i++;
			}
			max = Math.max(count, max);
		}
		System.out.println(size - max);
	}
}
