package Practise;

public class EvenOdd {

	void eo(int num1)
	{
		if(( num1  % 2) == 0)
		{
			System.out.println(num1 +" is Even");
		}
		else
		{
			System.out.println( num1 + " is Odd" );
		}
	}
	public static void main(String[] args) {
		EvenOdd e = new EvenOdd();
		e.eo(12);
		
		int num1 = 0;
		System.out.println( ((num1 % 2) == 0) ? "Even" : "Odd");
		String[] opt ={ "Even", "Odd" };
		System.out.println( (opt[num1 % 2]));
	}
	
}
