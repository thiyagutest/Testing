package Demo;

public class Pyramid {
	public static void main(String[] args) {
		int n = 5;
		int sp = n - 1;
		int st = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < sp; j++) {
				System.out.print(" ");
			}
			
			for (int j = 0; j < st; j++) {
				System.out.print("*");
			}

			System.out.println();
			
			st += 2;
			sp--;
		}
	}
}
