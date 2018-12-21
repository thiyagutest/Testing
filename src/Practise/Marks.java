package Practise;

public class Marks {
	void mar(int mark1, int mark2, int mark3, int mark4)
{
	float avg = ((mark1 + mark2 + mark3 + mark4)/4);
	//System.out.println("Average of Marks :" + avg);
	if (avg >100)
	{
		System.out.println("Please Enter valid Marks <=100");
	}
	
	else if (avg >75)
	{
		System.out.println("Distinction - " + avg + " %");
	}
	else if (avg >60 & avg <=75) 
	{
	System.out.println("First class - " + avg + " %");	
	}
	else if (avg > 50 & avg <=60) 
	{
	System.out.println("Second Class - " + avg + " %");	
	}
	else if (avg >= 35 & avg <= 50) 
	{
	System.out.println("Pass - " + avg + " %");
	}
	else
	{
		System.out.println("Fail");
	}
	
}
	public static void main(String[] args) {
		Marks m = new Marks();
		m.mar(60, 60, 330, 30);
	}
}
