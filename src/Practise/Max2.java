package Practise;

public class Max2 {
	void ma(int num1, int num2)
	{
		if (num1 > num2)
		{
			System.out.println(num1);
		}
		else 
		{
			System.out.println(num2);
		}
	}
public static void main(String[] args) {
	Max2 m = new Max2();
	m.ma(10,5);
}
	
}
