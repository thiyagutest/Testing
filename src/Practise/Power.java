package Practise;

public class Power {

//	int powe(int num1, int num2) {
//		int res;
//		int res1 = 0;
//		for (res = 1; res <= num1; res++) {
//			res1 = res * num2;
//		}
//		return res1;
//	}
//
	public static void main(String[] args) {
//		Power p = new Power();
//		int pp = p.powe(2, 3);
//		System.out.println("Result " + pp);
//		
		
		int base = 3, exponent = 4, result = 1;
		
		for(exponent = 4; exponent !=0; exponent--)
		{
			result *= base;
			//result = result * base;
		}
		
	System.out.println(result);
	}
}
