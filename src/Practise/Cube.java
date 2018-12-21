package Practise;

public class Cube {
	int cub(int num1, int num2, int num3) {
		int res = num1 * num2 * num3;
		return res;
	}

	public static void main(String[] args) {
		Cube c = new Cube();
		int res = c.cub(2, 2, 2);
		System.out.println("Cube of a number is " + res);
	}
}
