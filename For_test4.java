import java.util.*;

public class For_test4 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int j = 1;
		int k = sc.nextInt();
		System.out.print(j + " + ");
		for(int i = 2; i <= k; i++) {
			j += (i * i);
			if (i == k) System.out.printf("(%d * %d)", i, i);
			else System.out.printf("(%d * %d) + ", i, i);
			
		}
		System.out.printf(" = %d", j);
		
	}
}