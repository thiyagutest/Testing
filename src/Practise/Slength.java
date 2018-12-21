package Practise;

public class Slength {
void checkLength(String input)
{
	if(input.length() == 5)
	{
		System.out.println("Yes");
	}
	else
	{
		System.out.println("No");
	}
		
	
}
public static void main(String[] args) {
	Slength sl = new Slength();
	sl.checkLength("Thiya");
}
}