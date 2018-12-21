package Demo;

public class Digit {
	public static void main(String[] args) {
		int count = 0;
		int n = 125;
		while(n>0)
		{
			
			n = n/10;
			count = count + 1;
		}
		System.out.println(count);
	}

}
