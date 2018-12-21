package Practise;

public class Average {

	float avge(float num1, float num2, float num3) {
		float av = ((num1 + num2 + num3) / 3);
		return av;
	}

	public static void main(String[] args) {
		Average a = new Average();
		float av = a.avge(10, -30, 20);
		if (av > 0) {
			System.out.println(av);
		} else {
			System.out.println("Divide by zero error");
		}
		// System.out.println(av);
	}
}
