package Practise;

public class PositiveNegative {
	
//	String[] check(int num)
//	{
//		String[] kk = {"Positive", "Negative"};
//		if (num>=0)
//			return kk;
//		else 
//			return kk;
//		
//	}
	
	
	String check(int num)
	{
			if (num >= 0)
		{
			return "Positive";
		}
		else
		{
			return "Negative";
		}
	}
	
	
	public static void main(String[] args) {

		PositiveNegative p = new PositiveNegative();
		String s = p.check(15);
		
		System.out.println(s);
		
		//Normal way
		int num1 = -9;
		System.out.println((num1 >= 0) ? "Positive" : "Negative");
		
}
}