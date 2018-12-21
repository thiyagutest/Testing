package Practise;

public class Square {
	int square(int a) {
		int result = a * a;
		return result;
	}

	public static void main(String[] args) {
		Square s = new Square();
		int result = s.square(5);
		System.out.println("Square of number is " + result);
	}
}
