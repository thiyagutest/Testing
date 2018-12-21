package Practise;

public class Subtraction {
	int sub(int num1, int num2)
	{
		int num3 = num1 - num2;
		return num3;
		//return num1 - num2;
	
	}
	public static void main(String[] args) {
		Subtraction s = new Subtraction();
		int num3 = s.sub(15, 10);
		System.out.println("Subtraction of number is " + num3);
	}
}
