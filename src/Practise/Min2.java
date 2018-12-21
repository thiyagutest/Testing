package Practise;

public class Min2 {
	
	void numbers(int num1, int num2)
	{
		if(num1 > num2)
		{
			System.out.println(+num2);
		}
		else if (num1 < num2)
		{
			System.out.println( + num1);
		}
		else
		{
			System.out.println("Equal ");
		}
	}
	public static void main(String[] args) {
		Min2 m = new Min2();
		m.numbers(15,30);
		
		
		
	}

}
