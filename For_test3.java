import java.util.*;

public class For_test3 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		double j = 0;
		for(int i = 1; i <= k; i++) {
			j += ((double)1/(double)i);
			if (i == 1) System.out.print("1");
			else System.out.print(" + 1 / " + i);
			if (i % 5 ==0) {
				System.out.println();
			}
		}
		System.out.printf(" = %.3f", j);
		
	}
}