package Practise;

public class CheckString {
void CheckStringequal(String s1, String s2)
{
	if (s1.equalsIgnoreCase(s2))
	{
		System.out.println("True");
	}
	else
	{
		System.out.println("False");
	}
}

public static void main(String[] args) {
	CheckString c = new CheckString();
	c.CheckStringequal("Thiyagu", "thiyagu");
}
}
