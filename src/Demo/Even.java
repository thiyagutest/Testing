package Demo;

public class Even {
	public static void main(String[] args) {
		int n = 52631;
		int l = 0;
		int even = 0, odd = 0, count = 0;
				
		
		while (n > 0) {
			l = n % 10;

			if (l % 2 == 0)
			{
				even = even + l;
			}
			else
			{
				odd = odd + l;
			}
			n = n / 10;
			count++;
		}
		n = n/ 10;
		System.out.println("Even :" +even);
		System.out.println("Odd :" +odd);
		System.out.println("Count of numbers :" +count);
	}

	
}
