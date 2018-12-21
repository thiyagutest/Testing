package Practise;

public class CheckInt {
	void CheckInteger(int num) {
		if (num == 1) {
			System.out.println("One");
		} else if (num == 2) {
			System.out.println("Two");
		} else if (num == 3) {
			System.out.println("Three");
		} else if (num == 4) {
			System.out.println("Four");
		} else {
			System.out.println("Error");
		}
	}

	public static void main(String[] args) {
		CheckInt c = new CheckInt();
		c.CheckInteger(0);
	}
}
