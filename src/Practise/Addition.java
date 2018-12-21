package Practise;

public class Addition {
	int add(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {
		Addition aa = new Addition();
		int num3 = aa.add(15, 25);
		System.out.println("Addition of number is " + num3);
	}
}
