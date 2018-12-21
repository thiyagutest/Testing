package Practise;

public class Lessthan10 {
	void checknumber(int num1)
	{
		if (num1 < 10)
		{
			System.out.println( num1 +" Less");
		}
		else
		{
			System.out.println( num1 +" More");
		}
	}
public static void main(String[] args) {
	Lessthan10 ls = new Lessthan10();
	ls.checknumber(15);
}
}
