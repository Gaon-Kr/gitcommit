public class For_test2 {
	public static void main (String[] args) {
		int k = 1;
		for(int i = 1; i <=4; i++) {
			for (int j = 1; j <= i; j++) {
				if (k >= 10) {System.out.print(k);}
				else System.out.print("0" + k);
				k++;
			}
			System.out.println();
		}
		
	}
}