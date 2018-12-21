package Practise;

public class Division {
	void div(int num1, int num2)
	{
		int num3 = num1/num2;
		System.out.println("Division of number is " +num3);
	}
public static void main(String[] args) {
	Division d = new Division();
	d.div(10, 20);
}
}
