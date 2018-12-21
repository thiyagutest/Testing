package Demo;

public class Sam {
	public static void main(String[] args) {

		int num = 1234, even = 0, odd = 0, count = 0;
		if (num < 0) {
			num *= -1;
		} else if (num == 0) {
			count++;
		}
		while (num > 0) {
			int l = num % 10;
			if (l % 2 == 0) {
				even = even + l;
			} else {
				odd = odd + l;
				//num = num / 10;
			}
			
			num = num / 10;
			count++;
		
		}
		System.out.println(count);
		System.out.println(even);
		System.out.println(odd);
	}

}
