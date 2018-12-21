package Practise;

public class CheckGender {

	void Gender(char c) {
		if (c == 'M' || c == 'm') {
			System.out.println("Male");
		} else if (c == 'F' || c == 'f') {
			System.out.println("Female");
		} else {
			System.out.println("Others");
		}
	}

	public static void main(String[] args) {
		CheckGender g = new CheckGender();
		g.Gender('f');
	}
}
