package Practise;

public class FindInr {

	void rupees(double dollar, double rate)
	{
		double inr = 0;
		inr = dollar * rate;
		System.out.println("Amount in Rupees " + inr);
		
	}
	public static void main(String[] args) {
		FindInr f = new FindInr();
		f.rupees(2, 66);
	}
}
