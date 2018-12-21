package Demo;

public class EDigits {

		public static void main(String[] args) {

			int n = 523210;
			int l = 0;
		 	int e1 = 0, o1 = 0, count = 0;
						
			while (n > 0) {
				l = n % 10;

				if (l % 2 == 0)
				{
					e1++;
				}
				else
				{
					o1++;
				}
				n = n / 10;
				count++;
			}
		
			
			System.out.println("Even : " +e1);
			System.out.println("Odd : " +o1);
			System.out.println("Total Count : "+count);

		}
	}


