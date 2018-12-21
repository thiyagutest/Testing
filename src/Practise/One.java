package Practise;

public class One {

	void Payment(long no, int password) {
		System.out.println("Debit card");
	}

	void Payment(long ccno, String password) {
		System.out.println("Credit card");
	}

	void Payment(Otp o) {
		System.out.println("Internet Banking"+o.getOtpLen());
	}

	void Payment(Mpin m) {
		System.out.println("upi");
	}

	public static void main(String[] args) {
		One one1 = new One();
		// Debit card
		one1.Payment(12345673456L, 123456);
		// Credit card
		one1.Payment(12340456789L, "admin@123");
		// Internet banking
		Otp ooo = new Otp();
		ooo.setOtpLen(4);
		one1.Payment(ooo);
		// upi
		Mpin mm = new Mpin();
		one1.Payment(mm);

	}
}
