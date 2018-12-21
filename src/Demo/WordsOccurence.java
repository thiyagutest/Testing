package Demo;

import java.util.HashMap;

public class WordsOccurence {

	public static void main(String[] args) {

		String mess = "Hello World Hello World";
		mess = mess.replace(" ", "");
		System.out.println(mess);

		HashMap<Character, Integer> h = new HashMap<Character, Integer>();

		char[] c = mess.toCharArray();

		for (char x : c) {
			{
				if (h.containsKey(x)) {
					int val = h.get(x) + 1;
					h.put(x, val);
				} else {
					h.put(x, 1);
				}
			}

		}
		System.out.println(h);
	}
}
