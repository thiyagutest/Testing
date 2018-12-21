package Practise;

public class NumberEqual {

	void isequal(int num1, int num2)
	{
		if (num1 == num2 )
		{
			System.out.printf(num1 +  " Equal " +num2);
		}
		else
		{
			System.out.println(num1 +  " Not Equal " +num2 );
		}
	}
public static void main(String[] args) {
	NumberEqual n = new NumberEqual();
	n.isequal(10, 110);
}
}
